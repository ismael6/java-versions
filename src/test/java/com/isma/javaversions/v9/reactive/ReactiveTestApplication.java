package com.isma.javaversions.v9.reactive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.reactivestreams.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

@SpringBootApplication
@EnableMongoRepositories
public class ReactiveTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveTestApplication.class, args);
    }

}

@Component
class IntervalMessageProducer {
    Flux<String> produce(){
        return Flux.fromStream(Stream.generate(() ->"Hello @ " + Instant.now()))
                .delayElements(Duration.ofSeconds(1));
    }

    @Bean
    RouterFunction<ServerResponse> route(ReservationRepository rr) {
        return RouterFunctions
                .route()
                .GET("/reservations2",
                        request -> ServerResponse.ok().body(rr.findAll(), Reservation.class))
                .build();
    }
}

@RestController
@AllArgsConstructor
class ReservationController{
    private final ReservationRepository reservationRepository;
    private final IntervalMessageProducer imp;
    @GetMapping("/reservations")
    Publisher<Reservation> reservationPublisher(){
        return this.reservationRepository.findAll();
    }
    @GetMapping (produces = MediaType.TEXT_EVENT_STREAM_VALUE, value = "/streamingData")
    Publisher<String> streamingPublisher(){
        return this.imp.produce();
    }
}


@Component
@RequiredArgsConstructor
@Log4j2
class SampleDataInitializer {

    private final ReservationRepository reservationRepository;
    @EventListener(ApplicationReadyEvent.class)
    public void initialize(){
        Flux<String> names = Flux.just("Peter", "Jhon", "Anna", "Lucas", "Maria");
        Flux<Reservation> reservationFlux = names.map(name -> new Reservation(null, name));
        Flux<Reservation> persisted = reservationFlux.flatMap(this.reservationRepository::save);

        reservationRepository
                .deleteAll()
                .thenMany(persisted)
                .thenMany(this.reservationRepository.findAll())
                .subscribe(log::info);
    }
}

interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> { }

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
class Reservation{
    @Id
    private String id;
    private String name;
}