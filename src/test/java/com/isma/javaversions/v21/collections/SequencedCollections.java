package com.isma.javaversions.v21.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SequencedCollections {

    @Test
    public void before(){
        List l = new ArrayList();

        l.add(0, 0);
        l.add(l.size() - 1, 9999);

        l.get(0);
        l.get(l.size() - 1);

        l.remove(0);
        l.remove(l.size() - 1);

        TreeMap<Integer, String> map = new TreeMap<>();

        map.entrySet().iterator().next();
        List listFromMap = new ArrayList<>(map.keySet());
        listFromMap.get(listFromMap.size()-1);
    }

    @Test
    public void sequencedCollections(){
        List<Integer> l = List.of(1,2,3,4,5);
        l.addFirst(0);
        l.addLast(6);
        l.getFirst();
        l.getLast();
        l.removeFirst();
        l.removeLast();

        SequencedMap<Integer, String> map = new TreeMap<>();
        map.firstEntry();
        map.lastEntry();
    }
}
