package com.isma.javaversions.v13.previews.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMethods {

    @Test
    public void translateEscapes(){
        var text = "any \t some";
        System.out.println(text);
        System.out.println(text.translateEscapes());
    }

    @Test
    public void stripIndent(){
        var text = "          some        ";
        assertEquals("some", text.stripIndent());
    }

    @Test
    public void formatted() {
        var value ="Some";
        System.out.println(String.format("value is %s", value));
        System.out.println("value is %s".formatted(value));
    }
}
