package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.isma.javaversions.v8.functional.foundationBlocks.BeforeLambdas2.StudentType.*;

public class BeforeLambdas2{

    // CLIENT ARTIFACT
    @Test
    public void usingDiscriminatorValueToAvoidRepeatMethods(){
        List<Integer> results = List.of(5,9,3,7,6);
        System.out.println(countStudentsApproved(KINDER_GARDEN, results));
        System.out.println(countStudentsApproved(ELEMENTARY_SCHOOL, results));
        System.out.println(countStudentsApproved(HIGH_SCHOOL, results));
    }


    // PROVIDER ARTIFACT
    enum StudentType {
        KINDER_GARDEN,
        ELEMENTARY_SCHOOL,
        HIGH_SCHOOL;
    }
    private int countStudentsApproved(StudentType studentType, List<Integer> results){
        int totalApproved = 0;
        for (Integer result : results) {
            boolean approved = false;
            switch (studentType){
                case KINDER_GARDEN: approved = result > 5; break;
                case ELEMENTARY_SCHOOL: approved = result > 6; break;
                case HIGH_SCHOOL: approved = result > 7; break;
                default:
            }
            if(approved){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }

    /**
     * code smell -> Not applying open/close principle
     *  What can go wrong? -> A change in the requirement implies modifying existing method,
     *                          regression's favorite root cause.
     */
}
