package com.isma.javaversions.v13.previews;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Switch {

    @Test
    public void yield(){
        var result = switch (LocalDate.now().getDayOfWeek()) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println(":(");
                yield "Working Day";
            }
            case SATURDAY, SUNDAY -> {
                System.out.println(":)");
                yield "Day Off";
            }
        };
        System.out.println("after switch "+ result);
    }
}
