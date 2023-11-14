package com.isma.javaversions.v16;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatChange {

    @Test
    public void periodOfDay(){
        LocalTime date = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        System.out.println(date.format(formatter));
    }
}
