package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

public class BeforeLambdas3 {

    // CLIENT ARTIFACT
    @Test
    public void encapsulateWhatVaries(){
        System.out.println(countStudentsApproved(new StudentApprovedRule() {
                @Override
                public boolean isApproved(Integer result) {
                    return result > 5;
                }
            },
    5, 9, 3, 7, 6));

        System.out.println(countStudentsApproved(new StudentApprovedRule() {
                 @Override
                 public boolean isApproved(Integer result) {
                    return result > 6;
                 }
             },
     5, 9, 3, 7, 6));

        System.out.println(countStudentsApproved(new StudentApprovedRule() {
                 @Override
                 public boolean isApproved(Integer result) {
                     return result > 7;
                 }
             },
     5, 9, 3, 7, 6));
    }


    // PROVIDER ARTIFACT
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
     * code smell -> gross verbosity on client side
     *  What can go wrong? -> gross verbose code is low maintainable code
     */
}
