package com.isma.javaversions.v17.switchimprovements;

import org.junit.jupiter.api.Test;

public class GuardedPatterns {

    public void before(Object o){
        switch(o) {
            case String s:
                if(s.length() == 1){
                    String.format("char");
                } else {
                    String.format("word");
                } break;
            default:
                String.format("any");
        }
    }

    public String usingGuardedPatterns(Object o){
        return switch(o) {
            case String s when s.length() == 1 -> String.format("char %s", s);
            case String s -> String.format("word %s", s);
            default -> String.format("any ", o.toString());
        };
    }

    @Test
    public void test(){
        System.out.println(usingGuardedPatterns("r"));
        System.out.println(usingGuardedPatterns("word"));
        System.out.println(usingGuardedPatterns(5));
    }
}
