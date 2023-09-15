package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StatelessIntermediateOperations {

    @Test
    public void filteringOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .filter(m -> m.split(" ").length > 1)
            .forEach(System.out::println);
    }

    @Test
    public void transformationOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }

    @Test
    public void debuggingOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .peek(m -> System.out.println("before filter:" + m))
            .filter(m -> m.split(" ").length > 1)
            .peek(m -> System.out.println("after filter:" + m))
            .map(String::length)
            .forEach(System.out::println);
    }
}