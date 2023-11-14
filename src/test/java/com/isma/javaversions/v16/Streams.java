package com.isma.javaversions.v16;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    @Test
    public void toList(){

        Stream.of(1,2,3).collect(Collectors.toList());

        Stream.of(1,2,3).toList();
    }
}
