package com.isma.javaversions.v9.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {

    @Test
    public void optionalToStream() {
        List<Integer> ints = Optional.of(List.of(1,2,3))
            .map(List::stream)
            .map(s -> s.filter(n -> n > 0))
            .map(s -> s.sorted())
            .map(s -> s.collect(Collectors.toList()))
            .get();
        System.out.println(ints);






        Optional.of(3).stream().forEach(System.out::println);

        Optional.empty().stream().forEach(System.out::println);

        Optional.of(List.of(1,2,3))
            .stream()
            .flatMap(List::stream)
            .filter(n -> n > 0)
            .sorted()
            .forEach(System.out::println);
    }

    @Test
    public void streamImprovements() {
        Stream.of(1,2,3,4,5,6,5,4,3,2,1)
            .takeWhile(n -> n < 3)
            .forEach(System.out::println);

        System.out.println();

        Stream.of(1,2,3,4,5,6,5,4,3,2,1)
                .dropWhile(n -> n < 4)
                .forEach(System.out::println);

        System.out.println();




        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .forEach(System.out::println);




        Stream.of(null);
        Stream.ofNullable(null);
    }
}
