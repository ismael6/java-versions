package com.isma.javaversions.v12;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorFeatures {

    @Test
    public void teeing(){
        var average = Stream.of(1,2,3,4,5)
            .collect(Collectors.teeing(
                    Collectors.summingInt(i -> i),
                    Collectors.counting(),
                    (sum, count) -> sum/count
            ));
        System.out.println(average);
    }
}
