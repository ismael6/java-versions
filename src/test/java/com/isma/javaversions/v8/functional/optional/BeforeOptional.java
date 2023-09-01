package com.isma.javaversions.v8.functional.optional;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class BeforeOptional {

    @Test
    public void weAreWalkingInAGreenFieldFullOfHiddenNullPointerExceptionMines(){
        PersonRepository repository = new PersonRepository();
        Person p = repository.getPersonById(2); //(it returns null if id <> 2)
        String greetings = p.sendGreetings(); //(it returns null if the person is not having a good time)
        System.out.println(greetings.toLowerCase());
    }


    class PersonRepository {
        Person getPersonById(Integer id){
            return id.equals(2)
                    ? new Person()
                    : null;
        }
    }

    class Person{
        String sendGreetings(){
            return new Random().nextInt(2) == 1? "HI" : null;
        }
    }



    @Test
    public void tryingToBeNullDefensiveOpensTheGatesOfComplexityHell(){
        PersonRepository personRepository = new PersonRepository();
        Person p = personRepository.getPersonById(2);
        if(p != null){
            String greetings = p.sendGreetings();
            if(greetings != null){
                System.out.println(greetings.toLowerCase());
            } else{
                System.out.println("default greetings");
            }
        } else{
            System.out.println("default greetings");
        }
    }
}
