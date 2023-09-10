package com.isma.javaversions.v8.functional.stream;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class CinemaDataProvider {

    public static Cinema getCinema(){
        return Cinema.builder().name("Cinemex")
            .movies(
                Arrays.asList(
                    Movie.builder()
                        .name("Barbie the movie")
                        .price(50)
                        .rate("PG-13")
                        .stars(7.3F)
                        .actors(
                            Arrays.asList(
                                Actor.builder().name("Margot Robbie").age(33).build(),
                                Actor.builder().name("Ryan Gosling").age(42).build()
                            )
                        )
                    .build(),
                    Movie.builder()
                        .price(30)
                        .name("La La Land")
                        .rate("PG-15")
                        .stars(7.5F)
                        .actors(
                            Arrays.asList(
                                Actor.builder().name("Emma Stone").age(34).build(),
                                Actor.builder().name("Ryan Gosling").age(30).build()
                            )
                        )
                    .build(),
                    Movie.builder()
                        .name("Oppenheimer")
                        .price(100)
                        .rate("M")
                        .stars(8.6F)
                        .actors(
                            Arrays.asList(
                                Actor.builder().name("Cillian Murphy").age(33).build(),
                                Actor.builder().name("Florence Pugh").age(42).build()
                            )
                        )
                        .build(),
                    Movie.builder()
                        .price(25)
                        .name("Cruella")
                        .rate("PG-13")
                        .stars(6.4F)
                        .actors(
                            Arrays.asList(
                                Actor.builder().name("Emma Stone").age(34).build(),
                                Actor.builder().name("Emma Thompson").age(64).build()
                            )
                        )
                    .build()
                )
            )
        .build();
    }

    public static Cinema getCinemaFromJson(){
        String json =
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
        return new Gson().fromJson(json, Cinema.class);
    }
}



@Data
@Builder
class Cinema {
    private String name;
    private List<Movie> movies;
}

@Data
@Builder
class Movie{
    private String name;
    private String rate;
    private Float stars;
    private int price;
    private List<Actor> actors;
}

@Data
@Builder
class Actor{
    private String name;
    private int age;
}