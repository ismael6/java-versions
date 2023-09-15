package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class DataSourceOperations {

    @Test
    public void usingExplicitArguments() {
        Stream.empty()
                .forEach(System.out::println);
        Stream.of("ds")
                .forEach(System.out::println);
        Stream.of("d", "", "s", 1)
                .forEach(System.out::println);
    }

    @Test
    public void usingBuilderPattern() {
        Stream.Builder builder = Stream.builder();
        for(Integer i : Arrays.asList(1, 2, 3)){
            builder.add(i);
        }
        builder.build().forEach(System.out::println);
    }

    @Test
    public void fromMutableElements() throws IOException {
        Arrays.asList("1", "2", "3")
                .stream()
                .forEach(System.out::println);
        new HashSet() {{
            add(1);
            add(2);
            add(3);
        }}.stream()
                .forEach(System.out::println);

        new HashMap<>() {{
            put(1, "one");
        }}.entrySet().stream()
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .forEach(System.out::println);

        Files.lines(Paths.get("./src/test/resources/cinema.json").toAbsolutePath())
                .forEach(System.out::println);
    }

    @Test
    public void fromCustomLogic() { // allow to process infinite elements
        //Stream.generate(() -> Math.random())
        //        .forEach(System.out::println); //prints infinite random numbers

        Stream.iterate(1, n -> n + 2)
                .forEach(System.out::println); //prints infinite odd numbers


        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
               .forEach(System.out::println);
    }

}