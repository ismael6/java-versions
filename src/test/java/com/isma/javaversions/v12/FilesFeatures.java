package com.isma.javaversions.v12;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesFeatures {

    @Test
    public void mismatch() throws IOException {
        Path file1 = Files.writeString(
                Files.createFile(Path.of("./file1.txt")),
                "Samples text");
        Path file2 = Files.writeString(
                Files.createFile(Path.of("./file2.txt")),
                "Sample text");
        System.out.println(Files.mismatch(file1, file2));
    }
}
