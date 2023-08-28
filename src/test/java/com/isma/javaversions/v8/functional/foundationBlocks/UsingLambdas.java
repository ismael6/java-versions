package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

public class UsingLambdas {

    // CLIENT ARTIFACT
    @Test
    public void usingFunctionalInterfaces(){
        System.out.println(countStudentsApproved(kinderGardenRule, 5, 9, 3, 7, 6));
        System.out.println(countStudentsApproved(elementarySchoolRule, 5, 9, 3, 7, 6));
        System.out.println(countStudentsApproved(highSchoolRule, 5, 9, 3, 7, 6));
    }


    // RULES PROVIDER ARTIFACT
    StudentApprovedRule kinderGardenRule = r -> r > 5;

    StudentApprovedRule elementarySchoolRule = r -> r > 6;

    StudentApprovedRule highSchoolRule = r -> r > 7;



    // STATISTICS PROVIDER ARTIFACT
    @FunctionalInterface
    private interface StudentApprovedRule{
        boolean isApproved(Integer result);
    }

    private int countStudentsApproved(StudentApprovedRule rule, Integer... results){
        int totalApproved = 0;
        for (Integer result : results) {
            if(rule.isApproved(result)){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }

    /**
     * not duplicated code
     * clean and maintainable code
     * Single responsibility principle applied
     * Open closed principle applied
     * Liskov substitution principle applied
     * Interface segregation principle applied
     * Dependency inversion principle applied
     */
}
