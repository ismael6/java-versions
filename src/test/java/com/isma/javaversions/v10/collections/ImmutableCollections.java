package com.isma.javaversions.v10.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableCollections {

    @Test
    public void copyOf(){
        var list = Arrays.asList(1,2,3);
        var copyList = List.copyOf(list);
        var copySet = Set.copyOf(list);
        var map = Map.of(1,"one", 2, "two");
        var copyMap = Map.copyOf(map);

        list.add(4);
    }

    @Test
    public void streamToUnmodifiable(){
        var unmodifiableList =
                Stream.of(1,2,3)
                .collect(Collectors.toUnmodifiableList());

        var unmodifiableSet =
                Stream.of(1,2,3)
                .collect(Collectors.toUnmodifiableSet());

        var unmodifiableMap  =
                Stream.of(1,2,3)
                .collect(Collectors.toUnmodifiableMap(
                        Function.identity(),
                        n -> "("+n.toString()+")"));

        unmodifiableList.remove(0);
    }
}
