package com.isma.javaversions.v21.patternmatching;

import org.junit.jupiter.api.Test;

public class PatternMatching {

    record Point(int x, int y){}

    public void print(Object o) {
        switch (o) {
            case null                           -> System.out.print("null");
            case Point(int x, int y) when x > 3 -> System.out.printf("Large Point: %d,%d", x, y);
            case Point(int x, int y)            -> System.out.printf("Point: %d,%d", x, y);
            case String s                       -> System.out.printf("String: %s%n", s);
            default                             -> System.out.printf("something else: %s%n", o);
        }
    }

    @Test
    public void test(){
        print(new Point(5,2));
    }
}
