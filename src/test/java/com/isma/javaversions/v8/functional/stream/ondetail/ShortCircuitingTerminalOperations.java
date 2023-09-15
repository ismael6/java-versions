package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortCircuitingTerminalOperations {

    @Test
    public void getSomeElement(){
        System.out.println(Stream.of(1,2,3,4,5)
                .findFirst());

        System.out.println(Stream.of(1,2,3,4,5)
                .findAny());
    }


    @Test
    public void discriminating(){
        System.out.println(Stream.of(1,2,3,4,5)
                .allMatch(n -> n < 5));

        System.out.println(Stream.of(1,2,3,4,5)
                .noneMatch(n -> n < 5));

        System.out.println(Stream.of(1,2,3,4,5)
                .anyMatch(n -> n < 5));
    }
}
