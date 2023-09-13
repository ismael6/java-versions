package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StatefulIntermediateOperations {

    @Test
    public void truncateOps(){
        Stream.of(1,2,3,4,5)
                .limit(2)
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5)
                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    public void comparableOps(){
        Stream.of(1,2,3,4,5,3,4)
                .distinct()
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5,3,4)
                .sorted()
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5,3,4)
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);
    }

    @Test
    public void appendableOps(){
        Stream.concat(
                Stream.of(1,2,3),
                Stream.of(4,5,6))
                .forEach(System.out::println);
    }
}