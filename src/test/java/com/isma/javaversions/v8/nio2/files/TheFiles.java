package com.isma.javaversions.v8.nio2.files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/**
 *	java.nio.file.Files
 *      static methods that operate on files from Path
 *		throws exception if the file do not exist (almost all)
 */
public class TheFiles {

    @Test
    public void createDirectory() throws IOException {
//		Files.createDirectory(Paths.get("docs/files")); runtime exception, parent 'docs' directory doesn't exist
        Files.createDirectories(Paths.get("docs/files")); //ok, create required parents too
    }

    @Test
    public void move() throws IOException {
        Files.createDirectories(Paths.get("docs/files"));
        Files.createDirectories(Paths.get("docs/user"));
        Files.move(Paths.get("docs/files"), Paths.get("docs/user/files"));
    }

    @Test
    public void copy() throws IOException {
        Files.createDirectories(Paths.get("docs/files"));
        Files.createDirectories(Paths.get("docs/user"));
        Files.copy(Paths.get("docs/files"), Paths.get("docs/user/files"));
    }

    @Test
    public void remove() throws IOException {
        Files.createDirectories(Paths.get("docs/files"));
        //Files.delete(Paths.get("docs/files"));
        Files.deleteIfExists(Paths.get("docs/files"));
    }

    @Test
    public void exists() {
        System.out.println(Files.exists(Paths.get("docs/files")));
    }

    @Test
    public void isSameFile() throws IOException {
        Path path1 = Paths.get("/user/files/file.txt");
        Path path2 = Paths.get("/user/files/file.txt");
        Path path3 = Paths.get("/user/files/spec/../file.txt");

        System.out.println(Files.isSameFile(path1, path2));
        //System.out.println(Files.isSameFile(path2, path3)); // throw Exception because files not exists (even if the Path normalized is the same)
    }

    @Test
    public void getReadAttributes() throws IOException {
        Path path = Paths.get(".").toRealPath();

        BasicFileAttributes attributes =
                Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("path -> "+path);
        System.out.println("isDirectory -> "+attributes.isDirectory());
        System.out.println("isRegularFile -> "+attributes.isRegularFile());
        System.out.println("isSymbolicLink -> "+attributes.isSymbolicLink());
        System.out.println("isOther -> "+attributes.isOther());

        System.out.println("size on bytes -> "+attributes.size());

        System.out.println("creationTime -> "+attributes.creationTime());
        System.out.println("lastAccessTime -> "+attributes.lastAccessTime());
        System.out.println("lastModifiedTime -> "+attributes.lastModifiedTime());
        System.out.println("fileKey -> "+attributes.fileKey());
    }

    @Test
    public void readAllLines() throws IOException {
        Path path = Paths.get("./src/test/resources/cinema.json");
        List<String> lines = Files.readAllLines(path);
        for(String line: lines) {
            System.out.println(line);
        }
    }

    @Test
    public void writeToFile() throws IOException {
        Path theFile = Files.createFile(Paths.get("./someNewFileOnRootProject.txt"));
        String messageToWrite = "some text to write";
        Files.writeString(theFile, messageToWrite);
    }
}
