package com.isma.javaversions.v8.nio2.filesystem;

import org.junit.jupiter.api.Test;

import java.nio.file.*;
import java.nio.file.Path;

public class TheFilesystem {

    /**
     * @author IsmaSp6
     *
     *	FileSystem -> abstraction representing a FileSystem agent on SO(local or remote)
     *	FyleSystems -> factory methods for FileSystem
     *
     */
    @Test
    public void fileSystem() {
        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println(fileSystem.getSeparator());
        fileSystem.getRootDirectories().forEach(System.out::println);
        Path path1 = fileSystem.getPath("./src/test/resources/cinema.json");
    }
}
