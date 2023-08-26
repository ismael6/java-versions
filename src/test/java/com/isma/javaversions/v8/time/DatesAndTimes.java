package com.isma.javaversions.v8.time;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DatesAndTimes {

    @Test
    public void types(){
        System.out.println(
                LocalDate.now());
        System.out.println(
                LocalTime.now());
        System.out.println(
                LocalDateTime.now());
        System.out.println(
                ZonedDateTime.now());
    }

    @Test
    public void factories() {
        System.out.println(
                LocalDateTime.of(1988, Month.JUNE, 17, 6, 10));
        System.out.println(
                LocalDate.parse("2023-08-25"));
        System.out.println(
                LocalDate.ofEpochDay(0));
        System.out.println(
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

    @Test
    public void operations(){
        System.out.println(
                LocalDateTime.now().plusDays(1).minusHours(2));
        //System.out.println(
        //       LocalDate.now().plusDays(1).minusHours(2));
    }

    @Test
    public void novemberDayLightSavingTime(){
//		November DaylightSavingTime
        ZoneId zone = ZoneId.of("US/Eastern");
        LocalTime lt = LocalTime.of(1, 30);
        LocalDate ldNov = LocalDate.of(2016, Month.NOVEMBER, 6);
        ZonedDateTime novDaylightSavingDate = ZonedDateTime.of(ldNov, lt, zone);
        System.out.println("year-month-day T hour-minute : ZoneOffset [zoneId]");
        System.out.println(novDaylightSavingDate);							 //2016-11-06T01:30-04:00[US/Eastern]
        System.out.println(novDaylightSavingDate.plus(1, ChronoUnit.HOURS)); //2016-11-06T01:30-05:00[US/Eastern]
    }
}
