package com.isma.javaversions.v13.previews.string;

import org.junit.jupiter.api.Test;

public class StringTextBlocks {

    @Test
    public void before(){
        var json =
                "{\n" +
                        "  \"name\": \"Cinemex\",\n" +
                        "  \"movies\": [\n" +
                        "    {\n" +
                        "      \"name\": \"Barbie the movie\",\n" +
                        "      \"rate\": \"PG-13\",\n" +
                        "      \"stars\": 7.3,\n" +
                        "      \"price\": 50,\n" +
                        "      \"actors\": [\n" +
                        "        {\n" +
                        "          \"name\": \"Margot Robbie\",\n" +
                        "          \"age\": 33\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"name\": \"Ryan Gosling\",\n" +
                        "          \"age\": 42\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"name\": \"La La Land\",\n" +
                        "      \"rate\": \"PG-15\",\n" +
                        "      \"stars\": 7.5,\n" +
                        "      \"price\": 30,\n" +
                        "      \"actors\": [\n" +
                        "        {\n" +
                        "          \"name\": \"Emma Stone\",\n" +
                        "          \"age\": 34\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"name\": \"Ryan Gosling\",\n" +
                        "          \"age\": 30\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"name\": \"Oppenheimer\",\n" +
                        "      \"rate\": \"M\",\n" +
                        "      \"stars\": 8.6,\n" +
                        "      \"price\": 100,\n" +
                        "      \"actors\": [\n" +
                        "        {\n" +
                        "          \"name\": \"Cillian Murphy\",\n" +
                        "          \"age\": 33\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"name\": \"Florence Pugh\",\n" +
                        "          \"age\": 42\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"name\": \"Cruella\",\n" +
                        "      \"rate\": \"PG-13\",\n" +
                        "      \"stars\": 6.4,\n" +
                        "      \"price\": 25,\n" +
                        "      \"actors\": [\n" +
                        "        {\n" +
                        "          \"name\": \"Emma Stone\",\n" +
                        "          \"age\": 34\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"name\": \"Emma Thompson\",\n" +
                        "          \"age\": 64\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}";
        System.out.println(json);
    }

    @Test
    public void usingTextBlocks(){
        var json = """
        {
          "name": "Cinemex",
          "movies": [
            {
              "name": "Barbie the movie",
              "rate": "PG-13",
              "stars": 7.3,
              "price": 50,
              "actors": [
                {
                  "name": "Margot Robbie",
                  "age": 33
                },
                {
                  "name": "Ryan Gosling",
                  "age": 42
                }
              ]
            },
            {
              "name": "La La Land",
              "rate": "PG-15",
              "stars": 7.5,
              "price": 30,
              "actors": [
                {
                  "name": "Emma Stone",
                  "age": 34
                },
                {
                  "name": "Ryan Gosling",
                  "age": 30
                }
              ]
            },
            {
              "name": "Oppenheimer",
              "rate": "M",
              "stars": 8.6,
              "price": 100,
              "actors": [
                {
                  "name": "Cillian Murphy",
                  "age": 33
                },
                {
                  "name": "Florence Pugh",
                  "age": 42
                }
              ]
            },
            {
              "name": "Cruella",
              "rate": "PG-13",
              "stars": 6.4,
              "price": 25,
              "actors": [
                {
                  "name": "Emma Stone",
                  "age": 34
                },
                {
                  "name": "Emma Thompson",
                  "age": 64
                }
              ]
            }
          ]
        }
        """;
        System.out.println(json);
    }
}
