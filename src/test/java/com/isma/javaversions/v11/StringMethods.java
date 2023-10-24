package com.isma.javaversions.v11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMethods {

    @Test
    public void isBlank(){
        System.out.println("".isBlank());
        System.out.println("            ".isBlank());
        System.out.println(" \n  \t   \r".isBlank());
        System.out.println("some".isBlank());
    }

    @Test
    public void repeat(){
        System.out.println("Test".repeat(4));
    }

    @Test
    public void lines() {
        "line1\nline2\nline3"
        .lines()
        .forEach(System.out::println);
    }

    @Test
    public void strip(){
        assertEquals(
                "ab"
                , "\t\t\t  ab   \t\t\t  ".strip());
    }

    @Test
    public void stripLeading(){
        assertEquals(
                "ab   \t\t\t  "
                , "\t\t\t  ab   \t\t\t  ".stripLeading());
    }

    @Test
    public void stripTrailing(){
        assertEquals(
                "\t\t\t  ab"
                , "\t\t\t  ab   \t\t\t  ".stripTrailing());
    }
}
