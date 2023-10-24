package com.isma.javaversions.v11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethods {

    @Test
    public void writeString() throws IOException {
        Files.writeString(
                Files.createFile(Path.of("./writeString.txt")),
                "Sample text");
    }

    @Test
    public void readString() throws IOException {
        System.out.println(
                Files.readString(Path.of(".gitignore")));
    }
}
