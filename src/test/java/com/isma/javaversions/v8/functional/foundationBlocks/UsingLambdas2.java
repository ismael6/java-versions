package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class UsingLambdas2 {

    // CLIENT ARTIFACT
    @Test
    public void usingFunctionalInterfaces(){
        List<Integer> results = List.of(5,9,3,7,6);
        System.out.println(countStudentsApproved(kinderGardenRule, results));
        System.out.println(countStudentsApproved(elementarySchoolRule, results));
        System.out.println(countStudentsApproved(highSchoolRule, results));
    }


    // RULES PROVIDER ARTIFACT
    Predicate<Integer> kinderGardenRule = r -> r > 5;

    Predicate<Integer> elementarySchoolRule = r -> r > 6;

    Predicate<Integer> highSchoolRule = r -> r > 7;



    // STATISTICS PROVIDER ARTIFACT
    private int countStudentsApproved(Predicate<Integer> rule, List<Integer> results){
        int totalApproved = 0;
        for (Integer result : results) {
            if(rule.test(result)){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }


    /**
     *
     * Using custom defined FunctionalInteface's promotes a common vocabulary across community
     *
     *
     *
     *
     * Still STATISTICS-PROVIDER's code has next improvement areas:
     *       still is kind of verbose
     *       null error-prone
     *       state of input data is at risk
     *    Use STREAMS to grant readability, null safety, and stateless operations.
     *
     */
}
