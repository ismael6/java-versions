package com.isma.javaversions.v8.nio2.path;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *	Path.-
 *		Interface java.nio.file.Path
 *		replaces java.io.File
 *		Entry point for working with the NIO.2 API
 *		Represents a hierarchical path on the storage system to a file or directory
 *		support for symbolic links
 *
 *		Absolute path ->
 *			+ Starts with a forward slash (/user/file.txt)
 *			+ Starts with a drive letter (C:\\user\\file.txt)
 *
 *		Relative path ->
 *			+ Not absolute path
 */
public class ThePath {

    /**
     *	Path -> Interface (Entry point for working with NIO.2)
     *	Paths -> Class (Factory of Path)
     *
     *	URI -> Uniform resource identifier (constructor throws URISyntaxException)
     *		syntax
     *			schema -> [file://] | [http://] | [https://] | [ftp://] + Path
     */
    @Test
    public void paths() throws URISyntaxException {
//		using String path
        Path path1 = Paths.get("/home/isma/file.txt").toAbsolutePath();
        Path path2 = Paths.get("/home","isma","file.txt");
        Path path3 = Paths.get("/home/isma/Documents/../file.txt");

//		using URI
//		Path pathURI1 = Paths.get(new URI("file://user/file.txt")); // runtime exception URIs must have absolute paths
//      Path pathURI2 = Paths.get(new URI("file:///c:/user/files")); // ok, full path on URI (windows)
        Path pathURI3 = Paths.get(new URI("file:///home/isma/file.txt")); // ok, full path on URI (unix)

//		from a File Object
        File file = new File("file.txt");
        Path path = file.toPath(); // for onwards compatibility
        File file2 = path.toFile(); // for backwards compatibility

        System.out.println(path1.toUri());
        System.out.println(path2.toUri());
        System.out.println(path3.toUri());
    }
}
