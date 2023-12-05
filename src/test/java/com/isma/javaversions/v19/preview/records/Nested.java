package com.isma.javaversions.v19.preview.records;

import org.junit.jupiter.api.Test;

public class Nested {

    record Point(int x, int y){}

    record Line(Point x, Point y){}

    @Test
    public void test(){
        System.out.println(new Line(
                                new Point(1,2),
                                new Point(4,6)));
    }

    void deconstructNested(Object o){
        if(o instanceof Line(
                            Point(int x1, int y1),
                            Point(int x2, int y2))){
            System.out.println(x1 + "-" + y1 + "," + x2 + "-" + y2);
        }
    }

    @Test
    public void testDeconstructNested(){
        Line line = new Line(new Point(1,2), new Point(3,4));
        deconstructNested(line);
    }
}
