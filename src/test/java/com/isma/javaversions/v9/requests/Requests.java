package com.isma.javaversions.v9.requests;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Stream;

public class Requests {

    @Test
    public void get() throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request =
                HttpRequest
                .newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

        HttpResponse<Stream<String>> response =
                HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofLines());

        response.body().forEach(System.out::println);
    }
}