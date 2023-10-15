package com.isma.javaversions.v10.typeinference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarLocalType {

    @Test
    public void before(){
        String name = "Peter";
        VarLocalType type = new VarLocalType();
        List<Integer> list = new ArrayList<Integer>();
        List<Map<Integer, String>> list2 = new ArrayList<Map<Integer, String>>();
    }


    @Test
    public void after(){
        var name = "Peter";
        var type = new VarLocalType();
        var list = new ArrayList<Integer>();
        var list2 = new ArrayList<Map<Integer, String>>();

        System.out.println(name.getClass());
        System.out.println(type.getClass());
        System.out.println(list.getClass());
        System.out.println(list2.getClass());
    }

    @Test
    public void illegalVarUsages(){
        //var value;
        //var nullValue  = null;
        //var var = "var";
        //var r = s -> s.length() > 10;
        //var ints = {1,2,3,4};
        class SomeClass{
            //private var number = 4;
        }
    }

    @Test
    public void beCareful(){
        var list = new ArrayList<>();
        var shortValue = 3;
        var result = List.of("Peter", "Anna")
                .stream()
                .reduce((BinaryOperator<String>) Collectors.joining(",", "(",")"))
                .map(String::toUpperCase)
                .map(String::length)
                .map(Objects::toIdentityString)
                .map(Stream::of)
                .flatMap(Stream::findAny)
                .orElseThrow();
    }
}
