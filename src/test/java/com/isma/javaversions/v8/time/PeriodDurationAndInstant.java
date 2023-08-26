package com.isma.javaversions.v8.time;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDurationAndInstant {

    @Test
    public void types() {
        System.out.println(
                Period.of(3, 2, 1)); // from days and above
        System.out.println(
                Duration.of(3, ChronoUnit.DAYS)); // from days and below
        System.out.println(
                Instant.now());
    }

    @Test
    public void factories() {
        System.out.println(
                Period.between(LocalDate.now(), LocalDate.now().plusMonths(24)));
        System.out.println(
                Period.ofWeeks(4));
        System.out.println(
                Instant.ofEpochSecond(-1));
        System.out.println(
                Instant.MIN);
        System.out.println(
                Instant.MAX);
    }

    @Test
    public void operations() {
        System.out.println(
                LocalDateTime.now()
                    .plus(Period.ofWeeks(1))
                    .minus(Duration.ofMinutes(1))
            .isAfter(
                LocalDateTime.ofInstant(
                    Instant.now(),
                    ZoneId.of("US/Eastern"))));
    }
}