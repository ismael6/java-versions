package com.isma.javaversions.v8.functional.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Random;

public class OptionalOnDetail {

    class Person{
        Optional<String> sendGreetings(){
            return new Random().nextInt(2) == 1
                    ? Optional.of("HI")
                    : Optional.empty();
        }
    }

    @Test
    public void factories(){
        System.out.println(
                Optional.of(4));
        System.out.println(
                Optional.ofNullable(4));
        System.out.println(
                Optional.empty());
    }

    @Test
    public void pipelines(){
        System.out.println(
                Optional.of(4).filter(n -> n % 2 == 0));
        System.out.println(
                Optional.of(4).map(n -> n + 1));
        System.out.println(
                Optional.of(4).flatMap(n -> Optional.of(n + 1)));
    }

    @Test
    public void outputs(){
        //System.out.println(
        //       Optional.empty().get());
        System.out.println(
                Optional.empty().orElse(4));
        System.out.println(
                Optional.empty().orElseGet(() -> new Random().nextInt()));
        System.out.println(
                Optional.empty().isPresent());
        Optional.of(4).ifPresent(n -> System.out.println(n));
        System.out.println(
                Optional.empty().orElseThrow(() -> new IllegalArgumentException()));
    }
}


