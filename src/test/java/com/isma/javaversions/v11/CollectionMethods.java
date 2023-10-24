package com.isma.javaversions.v11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionMethods {

    @Test
    public void toArray() {
        var list = List.of(1,2,3);
        Integer[] array = list.toArray(Integer[]::new);
        assertThat(array).containsExactly(1,2,3);
    }
}
