package com.isma.javaversions.v11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class PredicateMethods {

    @Test
    public void before(){
        List.of("some", "", "text", "")
                .stream()
                .filter(s -> !s.isBlank())
                .forEach(System.out::println);
    }

    @Test
    public void not(){
        List.of("some", "", "text", "")
                .stream()
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::println);
    }
}