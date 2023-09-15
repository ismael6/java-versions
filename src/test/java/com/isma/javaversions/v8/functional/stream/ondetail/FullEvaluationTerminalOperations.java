package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FullEvaluationTerminalOperations {

    @Test
    public void getSomeElement(){
        System.out.println(Stream.of(1,2,3,4,5)
                .max(Integer::compareTo));

        System.out.println(Stream.of(1,2,3,4,5)
                .min(Integer::compareTo));
    }

    @Test
    public void consumeAllElements(){
        Stream.of(1,2,3,4,5)
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5)
                .forEachOrdered(System.out::println);
    }

    @Test
    public void accumulating(){
        System.out.println(Stream.of(1,2,3,4,5)
                .count());

        System.out.println(Stream.of(1,2,3,4,5)
                .reduce((a,b) -> a*b));

        System.out.println(Stream.of(1,2,3,4,5)
                .reduce(1, (a,b) -> a*b));
    }

    @Test
    public void toMutableDataStructure(){

        Stream.of(1,2,3)
                .collect(Collectors.toList());



        Stream.of(1,2,3)
                .collect(
                        () -> new TreeSet(),
                        (tree,n) -> tree.add(n),
                        (tree1,tree2) -> tree1.addAll(tree2)
                ).forEach(System.out::println);


        Stream.of(1,2,3)
                .collect(
                        () -> new HashMap(),
                        (tree,n) -> tree.put(n, n + "X"),
                        (tree1,tree2) -> tree1.putAll(tree2)
                ).entrySet()
                .forEach(System.out::println);


        System.out.println(Stream.of(1,2,3)
                .collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append
                ).toString());


        System.out.println(Stream.of("1","2","3")
                .map(Object::toString)
                .collect(Collectors.joining(",")));



        DoubleSummaryStatistics dss = Stream.of(1,2,3)
                .collect(Collectors.summarizingDouble(t -> t.doubleValue()));
        System.out.println(
                dss.getAverage()
                +" "+dss.getCount()
                +" "+dss.getMax()
                +" "+dss.getMin()
                +" "+dss.getSum());



        Integer[] ints = Stream.of(1,2,3)
                .toArray(Integer[]::new);
        for (Integer i: ints) {
            System.out.println(i);
        }

    }
}
