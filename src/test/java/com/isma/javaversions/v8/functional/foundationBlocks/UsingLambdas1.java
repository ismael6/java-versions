package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

import java.util.List;

public class UsingLambdas1 {

    // CLIENT ARTIFACT
    @Test
    public void usingFunctionalInterfaces(){
        List<Integer> results = List.of(5,9,3,7,6);
        System.out.println(countStudentsApproved(kinderGardenRule, results));
        System.out.println(countStudentsApproved(elementarySchoolRule, results));
        System.out.println(countStudentsApproved(highSchoolRule, results));
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

    private int countStudentsApproved(StudentApprovedRule rule, List<Integer> results){
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
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * Not so fast :)
     * Do we need to create new FunctionalInterface's everytime and everywhere?
     *   code smell -> type's overpopulation hell
     *      What can go wrong? -> Functional interfaces with different name but same contracts everywhere
     *      repeated semantics carries unclear, not maintainable, and highly coupled code
     */
}
