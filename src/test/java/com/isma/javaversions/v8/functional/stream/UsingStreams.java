package com.isma.javaversions.v8.functional.stream;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class UsingStreams {

    @Test
    public void getAllUniqueActorsUsingStreams(){
        CinemaDataProvider.getCinemaFromJson().getMovies()
        .stream()
        .map(Movie::getActors)
        .flatMap(Collection::stream)
        .map(Actor::getName)
        .distinct()
        .forEach(System.out::println);
    }


    @Test
    public void getMostExpensiveMovie(){
        CinemaDataProvider.getCinemaFromJson().getMovies()
        .stream()
        .max(Comparator.comparingInt(Movie::getPrice))
        .ifPresent(System.out::println);
    }

    @Test
    public void getMoviesByRate(){
        CinemaDataProvider.getCinemaFromJson().getMovies()
        .stream()
        .collect(Collectors.groupingBy(
                Movie::getRate,
                Collectors.toSet()))
        .entrySet()
        .forEach(System.out::println);
    }
}
