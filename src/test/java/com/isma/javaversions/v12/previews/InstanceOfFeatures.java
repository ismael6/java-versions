package com.isma.javaversions.v12.previews;

import org.junit.jupiter.api.Test;

public class InstanceOfFeatures {

    @Test
    public void before(){
        Object obj = "Hello World!";
        if (obj instanceof String) {
            System.out.println(((String) obj).length());
        }
    }

    @Test
    public void after(){
        Object obj = "Hello World!";
        if (obj instanceof String s) {
            System.out.println(s.length());
        }
    }
}
