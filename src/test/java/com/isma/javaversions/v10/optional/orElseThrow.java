package com.isma.javaversions.v10.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class orElseThrow {

    @Test
    public void before(){
        Optional.ofNullable(null).get();
    }

    @Test
    public void after(){
        Optional.ofNullable(null).orElseThrow();
    }
}
