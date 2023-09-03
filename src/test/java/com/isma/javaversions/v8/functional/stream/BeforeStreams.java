package com.isma.javaversions.v8.functional.stream;

import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeStreams {

    
    @Test
    public void getExpensiveMovie(){
        System.out.println(
            getCinemas()
            .stream()
            .map(Cinema::getMovies)
            .flatMap(Collection::stream)
            .map(Movie::getPrice)
            .collect(Collectors.toList())
        );
    }

    public List<Cinema> getCinemas(){
        return Arrays.asList(
            Cinema.builder().name("Cinemex")
                .movies(
                    Arrays.asList(
                        Movie.builder()
                            .name("Barbie the movie")
                            .price(50)
                            .rate("PG-13")
                            .stars(7.3F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Margot Robbie").age(33).build(),
                                    Actor.builder().name("Ryan Gosling").age(42).build()
                                )
                            )
                        .build(),
                        Movie.builder()
                            .price(30)
                            .name("La La Land")
                            .rate("PG-13")
                            .stars(7.5F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Emma Stone").age(34).build(),
                                    Actor.builder().name("Ryan Gosling").age(30).build()
                                )
                            )
                        .build(),
                        Movie.builder()
                            .price(25)
                            .name("Cruella")
                            .rate("PG-13")
                            .stars(6.4F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Emma Stone").age(34).build(),
                                    Actor.builder().name("Emma Thompson").age(64).build()
                                )
                            )
                        .build()
                    )
                )
            .build(),
            Cinema.builder().name("Cinepolis")
                .movies(
                    Arrays.asList(
                        Movie.builder()
                            .name("Barbie the movie")
                            .price(50)
                            .rate("PG-13")
                            .stars(7.3F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Margot Robbie").age(33).build(),
                                    Actor.builder().name("Ryan Gosling").age(42).build()
                                )
                            )
                        .build(),
                        Movie.builder()
                            .name("Oppenheimer")
                            .price(60)
                            .rate("R")
                            .stars(8.6F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Cillian Murphy").age(47).build(),
                                    Actor.builder().name("Florence Pugh").age(27).build()
                                )
                            )
                        .build(),
                        Movie.builder()
                                .name("Elemental")
                                .price(30)
                                .rate("PG")
                                .stars(6.6F)
                                .cast(
                                    Arrays.asList(
                                        Actor.builder().name("Leah Lewis").age(26).build(),
                                        Actor.builder().name("Maomoudou Athie").age(35).build()
                                    )
                                )
                        .build(),
                        Movie.builder()
                            .name("Elemental")
                            .price(30)
                            .rate("PG")
                            .stars(6.6F)
                            .cast(
                                Arrays.asList(
                                    Actor.builder().name("Leah Lewis").age(26).build(),
                                    Actor.builder().name("Maomoudou Athie").age(35).build()
                                )
                            )
                        .build()
                    )
                )
            .build()
        );
}


    @Data
    @Builder
    private static class Cinema {
        private String name;
        private List<Movie> movies;
    }

    @Data
    @Builder
    private static class Movie{
        private String name;
        private String rate;
        private Float stars;
        private int price;
        private List<Actor> cast;
    }

    @Data
    @Builder
    private static class Actor{
        private String name;
        private int age;
    }
}



