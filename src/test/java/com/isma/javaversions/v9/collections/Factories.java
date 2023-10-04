package com.isma.javaversions.v9.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Factories {

    @Test
    public void before(){
        List list = new ArrayList(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        System.out.println(list);
        list.remove(0);
        list.add(6);
        System.out.println(list);
    }

    @Test
    public void usingFactories(){
        List list = List.of(1,2,3,4,5);
        System.out.println(list);
        list.remove(0);
        list.add(6);
        System.out.println(list);
    }

    @Test
    public void listSetMap(){
        System.out.println(List.of(1,2,3,4,5));

        System.out.println(Set.of(1,2,3,4,5));

        System.out.println(Map.of(
                                1,"one",
                                2, "two",
                                3, "three"));
    }
}
