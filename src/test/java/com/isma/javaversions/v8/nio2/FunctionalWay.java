package com.isma.javaversions.v8.nio2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FunctionalWay {

    @Test
    public void list() throws IOException {
        Files.list(Paths.get(".").toRealPath())
                .forEach(System.out::println);
    }

    @Test
    public void walk() throws IOException {
        Files.walk(Paths.get(".").toRealPath())
                .forEach(System.out::println);
    }

    @Test
    public void find() throws IOException {
        Files.find(
                        Paths.get("./src/"),
                        12,
                        (path, attributes) -> path.toString().endsWith(".java") && attributes.isRegularFile())
                .forEach(System.out::println);
    }

    @Test
    public void lines() throws IOException {
        Files.lines(Paths.get("./src/test/resources/cinema.json"))
                .forEach(System.out::println);
    }
}
