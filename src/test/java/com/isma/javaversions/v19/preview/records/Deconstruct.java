package com.isma.javaversions.v19.preview.records;

import org.junit.jupiter.api.Test;

public class Deconstruct {

    record Point(int x, int y){}

    void before(Object o){
        if(o instanceof Point){
            Point p = (Point) o;
            int x = p.x;
            int y = p.y;
            System.out.println(x + "-" + y);
        }
    }

    void deconstructRecord(Object o){
        if(o instanceof Point(int x, int y)){
            System.out.println(x + "-" + y);
        }
    }

    @Test
    public void test(){
        deconstructRecord(new Point(1,4));
    }
}
