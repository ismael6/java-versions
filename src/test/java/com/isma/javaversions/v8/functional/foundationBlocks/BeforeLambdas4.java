package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

import java.util.List;

public class BeforeLambdas4 {

    // CLIENT ARTIFACT
    @Test
    public void encapsulateWhatVariesAndIsolateUsingTypes(){
        List<Integer> results = List.of(5,9,3,7,6);
        System.out.println(countStudentsApproved(kinderGardenRule, results));
        System.out.println(countStudentsApproved(elementarySchoolRule, results));
        System.out.println(countStudentsApproved(highSchoolRule, results));
    }



    // RULES PROVIDER ARTIFACT
    StudentApprovedRule kinderGardenRule = new StudentApprovedRule() {
        @Override
        public boolean isApproved(Integer result) {
            return result > 5;
        }
    };

    StudentApprovedRule elementarySchoolRule = new StudentApprovedRule() {
        @Override
        public boolean isApproved(Integer result) {
            return result > 6;
        }
    };

    StudentApprovedRule highSchoolRule = new StudentApprovedRule() {
        @Override
        public boolean isApproved(Integer result) {
            return result > 7;
        }
    };



    // STATICS PROVIDER ARTIFACT
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
     * code smell -> gross verbosity isolated is still gross verbosity
     *  What can go wrong? -> gross verbose code is low maintainable code
     */

}
