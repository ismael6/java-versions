package com.isma.javaversions.v14;

import org.junit.jupiter.api.Test;

public class ExplicitNullPointerExceptionMessage {

    @Test
    public void explicitMessage(){
        Integer i = null;
        System.out.println(i.toString());
    }
}
