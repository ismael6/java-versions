package com.isma.javaversions.v8.functional.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Random;

public class UsingOptional {


    class PersonRepository {
        Optional<Person> getPersonById(int id){
            return 2 == id
                    ? Optional.of(new Person())
                    : Optional.empty();
        }
    }

    class Person{
        Optional<String> sendGreetings(){
            return new Random().nextInt(2) == 1
                    ? Optional.of("HI")
                    : Optional.empty();
        }
    }


    @Test
    public void asWarningFlag(){
        /*
        PersonRepository repository = new PersonRepository();
        Person p = repository.getPersonById(2); // compiler demands to handle the possible null value
        String greetings = p.sendGreetings(); // compiler demands to handle the possible null value
        System.out.println(greetings.toLowerCase());
         */
    }

    @Test
    public void tryingToBeNullDefensiveUsingOptionalOpensTheGatesOfComplexityHellTwice(){
        PersonRepository personRepository = new PersonRepository();
        Optional<Person> p = personRepository.getPersonById(2);
        if(p.isPresent()){
            Optional<String> greetings = p.get().sendGreetings();
            if(greetings.isPresent()){
                System.out.println(greetings.get().toLowerCase());
            } else{
                System.out.println("default greetings");
            }
        } else{
            System.out.println("default greetings");
        }
    }

    @Test
    public void OptionalOperations(){
        
    }

    @Test
    public void useOptionalInADeclarativeWay(){
        System.out.println(
            new PersonRepository().getPersonById(2)
            .flatMap(Person::sendGreetings)
            .map(String::toLowerCase)
            .orElse("default greetings"));
    }
}
