package com.isma.javaversions.v21.string;

import org.junit.jupiter.api.Test;

public class StringTemplates {

    @Test
    public void before(){
        String name = "Tom";

        System.out.println("Hi " + name + "!");
        System.out.println(String.format("Hi %s!", name));
        System.out.println(new StringBuilder().append("Hi ").append(name).append("!"));
    }

    @Test
    public void StringTemplate(){
        String name = "Tom";
        System.out.println(STR."Hi \{name}!");
    }
}
