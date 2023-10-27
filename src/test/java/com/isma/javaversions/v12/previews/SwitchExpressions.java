package com.isma.javaversions.v12.previews;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpressions {

    @Test
    public void before(){
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }
        System.out.println(typeOfDay);
    }

    @Test
    public void usingSwitchExpressions(){
        System.out.println(
            switch (LocalDate.now().getDayOfWeek()) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
                case SATURDAY, SUNDAY -> "Day Off";
            }
        );

        switch (LocalDate.now().getDayOfWeek()) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Working Day");
            case SATURDAY, SUNDAY -> System.out.println("Day Off");
        }
    }
}
