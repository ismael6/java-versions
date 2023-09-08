package com.isma.javaversions.v8.functional.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.*;

public class BeforeStreams {

    @Test
    public void getAllUniqueActorsBeforeStreams(){
        List<String> uniqueActornames = new ArrayList<>();
        for(Movie movie: CinemaDataProvider.getCinemaFromJson().getMovies()){
            for(Actor actor: movie.getActors()){
                if(!uniqueActornames.contains(actor.getName())){
                    uniqueActornames.add(actor.getName());
                }
            }
        }
        for(String name: uniqueActornames){
            System.out.println(name);
        }
    }

    @Test
    public void getMostExpensiveMovie(){
        List<Movie> movies = CinemaDataProvider.getCinemaFromJson().getMovies();
        Movie mostExpensiveMovie = movies.get(0);
        for(int i = 1; i < movies.size(); i++){
            Movie currentMovie = movies.get(i);
            if(currentMovie.getPrice() > mostExpensiveMovie.getPrice()){
                mostExpensiveMovie = currentMovie;
            }
        }
        System.out.println(mostExpensiveMovie);
    }

    @Test
    public void getMoviesByRate(){
        Map<String, Set<Movie>> result = new HashMap<>();
        List<Movie> movies = CinemaDataProvider.getCinemaFromJson().getMovies();
        for(int i = 0; i < movies.size(); i++){
            Movie currentMovie = movies.get(i);
            String rate = currentMovie.getRate();
            if(result.containsKey(rate)){
                result.get(rate).add(currentMovie);
            } else{
                Set<Movie> moviesByRate = new HashSet();
                moviesByRate.add(currentMovie);
                result.put(rate, moviesByRate);
            }
        }
        for(Map.Entry<String, Set<Movie>> entry: result.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}



