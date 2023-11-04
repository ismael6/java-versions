package com.isma.javaversions.v14;

import org.junit.jupiter.api.Test;

public class StringMethods {

    @Test
    public void endOfLine() {
        var text = """
                some text really long for developer legibility \
                or checkstyle in same line can be split to new \
                line by using new end of line character  
                """;
        System.out.println(text);
    }

    @Test
    public void singleSpace() {
        var text = """
                    three\sdifferent\swords 
                    """;
        System.out.println(text);
    }
}
