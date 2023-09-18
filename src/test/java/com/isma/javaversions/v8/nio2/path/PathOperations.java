package com.isma.javaversions.v8.nio2.path;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperations {

    @Test
    public void pathData() {
        Path path = Paths.get("/home/isma/file.txt");
        System.out.println("name: " + path.getFileName());
        System.out.println("root: " + path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.toString());
        System.out.println(path.getNameCount());
    }

    @Test
    public void traversePathData() {
        Path path = Paths.get("/home/isma/file.txt");
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }

        Path parent = path;
        while ((parent = parent.getParent()) != null) {
            System.out.println("parent: " + parent);
        }

        Path path2 = Paths.get("zero/one/two.txt");

        System.out.println("from 0 to 2: "+path2.subpath(0, 3)); // including first element and excluding last element
        System.out.println("from 0 to 1: "+path2.subpath(0, 2));
        System.out.println("from 1 to 2: "+path2.subpath(1, 3));
    }


    @Test
    public void absolutePaths() {
        Path path1 = Paths.get("/home/isma/file.txt");
        System.out.println(path1.isAbsolute());
        System.out.println(path1.toAbsolutePath());

        Path path2 = Paths.get("./src/test/resources/cinema.json");
        System.out.println(path2.isAbsolute());
        System.out.println(path2.toAbsolutePath());
    }

    @Test
    public void pathNormalize() {
        System.out.println(
                Paths.get("F:/user/../docs/./file/../../home.txt")
                        .normalize());
    }

    @Test
    public void pathRelativize() {
//		for relative paths, relativize works as both are on the same directory
        Path relative1 = Paths.get("files/file.txt");
        Path relative2 = Paths.get("docs/document.txt");
        System.out.println(relative1.relativize(relative2));
        System.out.println(relative2.relativize(relative1));

//		absolute paths
        System.out.println();
        Path absolute1 = Paths.get("/files/file.txt");
        Path absolute2 = Paths.get("/info.txt");
        System.out.println(absolute1.relativize(absolute2));
        System.out.println(absolute2.relativize(absolute1));
    }

    @Test
    public void toRealPath() throws IOException {
        System.out.println(Paths.get(".").toRealPath());
        //System.out.println(Paths.get("./notExistingFile").toRealPath());
    }
}