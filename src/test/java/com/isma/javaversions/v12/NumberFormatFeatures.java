package com.isma.javaversions.v12;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatFeatures {

    @Test
    public void compactNumberFormat() {
        var shortFormat = NumberFormat.getCompactNumberInstance(
                            new Locale("en", "US"),
                            NumberFormat.Style.SHORT);
        System.out.println(shortFormat.format(123_456_789));
    }
}
