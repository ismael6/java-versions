package com.isma.javaversions.v12;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFeatures {

    @Test
    public void indent(){
        var text = "Line 1\nLine2\nLine3";
        System.out.println(text);

        var indentedText = text.indent(6);
        System.out.println(indentedText);

        var deIndentedText = indentedText.indent(-3);
        System.out.println(deIndentedText);
    }

    @Test
    public void transform() {
        var text = "someValue";
        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println(text.transform(reverse));
    }
}
