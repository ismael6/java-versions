package com.isma.javaversions.v11;

import org.junit.jupiter.api.Test;

public class ReflectionMethods {

    static class Inner {
        static class Inner2{

        }
    }

    @Test
    public void isNestMateOf() {
        System.out.println(Inner.class.isNestmateOf(ReflectionMethods.class));
        System.out.println(ReflectionMethods.class.isNestmateOf(Inner.class));
        System.out.println(Inner.class.isNestmateOf(Integer.class));
    }

    @Test
    public void getNestHost() {
        System.out.println(Inner.Inner2.class.getNestHost());
    }

    @Test
    public void getNestMembers() {
        Class[] inners = ReflectionMethods.class.getNestMembers();
        for(Class inner: inners){
            System.out.println(inner);
        }
    }
}