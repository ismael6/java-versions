package com.isma.javaversions.v8.functional.optional;

import org.junit.jupiter.api.Test;

public class GoodToRemember {

    private int primitive;

    private Integer referencedType;

    @Test
    public void defaultInitValues(){
        System.out.println(primitive);
        System.out.println(referencedType);
    }

    @Test
    public void defaultInitValuesII(){
        int[] primitives = new int[3];
        for(int i: primitives){
            System.out.println(i);
        }
        Integer[] references = new Integer[3];
        for(Integer i: references){
            System.out.println(i);
        }
    }

    @Test
    public void incompatibleWorlds(){
        Integer[] references = new Integer[3];
        for(int i: references){
            System.out.println(i);
        }
    }
}
