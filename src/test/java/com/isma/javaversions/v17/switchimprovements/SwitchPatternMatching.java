package com.isma.javaversions.v17.switchimprovements;

import org.junit.jupiter.api.Test;

public class SwitchPatternMatching {

    public String before(Object o) {
        String formatted = "?";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %s", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    public String usingSwitchPatternMatching(Object o) {
        return switch (o) {
            case null -> "null";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %s", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    @Test
    public void test(){
        System.out.println(usingSwitchPatternMatching(3));
        System.out.println(usingSwitchPatternMatching(3L));
        System.out.println(usingSwitchPatternMatching(3D));
        System.out.println(usingSwitchPatternMatching("3"));
        System.out.println(usingSwitchPatternMatching(new SwitchPatternMatching()));
    }
}