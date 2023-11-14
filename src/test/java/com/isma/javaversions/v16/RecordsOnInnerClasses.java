package com.isma.javaversions.v16;

public class RecordsOnInnerClasses {

    {
        new Inner.T(4, "5");
    }

    class Inner{
        record T(int a, String b){}

        {
            new T(4, "5");
        }
    }
}
