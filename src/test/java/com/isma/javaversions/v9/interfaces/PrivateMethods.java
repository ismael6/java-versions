package com.isma.javaversions.v9.interfaces;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class PrivateMethods {

    interface HavingPrivateMethods {

        List<String> names = List.of("Peter", "Jane", "Jhon");

        default boolean IsNamePresent(String name) {
            return names.contains(cleanString(name));
        }

        default String generateAlias(String id) {
            return new Random() + cleanString(id);
        }

        private String cleanString(String value) {
            return value.trim().toUpperCase(Locale.ROOT);
        }
    }
}
