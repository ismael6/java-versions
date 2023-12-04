package com.isma.javaversions.v19.records;

import org.junit.jupiter.api.Test;

public class Nested {

    record Point(int x, int y){}

    record Line(Point x, Point y){}

    @Test
    public void test(){
        System.out.println(new Line(
                                new Point(1,2),
                                new Point(4,6)));
    }
}
