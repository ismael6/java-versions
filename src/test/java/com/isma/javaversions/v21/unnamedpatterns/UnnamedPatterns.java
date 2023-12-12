package com.isma.javaversions.v21.unnamedpatterns;

import org.junit.jupiter.api.Test;

public class UnnamedPatterns {

    @Test
    public void test(){

        record Point(int x, int y){}

        Object obj = 1;

        String result = switch (obj) {

            case Point(int x, _) -> STR."Point of long: \{x}";
            case Byte _, Short _, Integer _, Long _ -> "Number";
            case Float _, Double _ -> "Floating-point number";
            case String _ -> "String";
            default -> "Other";
        };



        String s = "one";
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException _) {
            System.out.println("Invalid number: " + s);
        }
    }
}
