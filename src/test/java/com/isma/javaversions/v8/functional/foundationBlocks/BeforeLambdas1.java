package com.isma.javaversions.v8.functional.foundationBlocks;

import org.junit.jupiter.api.Test;

public class BeforeLambdas1 {


    // CLIENT ARTIFACT
    @Test
    public void duplicatedMethodsAsSmallInnerBehaviorChanges(){
        System.out.println(countKinderGardenStudentsApproved(5,9,3,7,6));
        System.out.println(countElementarySchoolStudentsApproved(5,9,3,7,6));
        System.out.println(countHighSchoolStudentsApproved(5,9,3,7,6));
    }


    // PROVIDER ARTIFACT
    private int countKinderGardenStudentsApproved(Integer... results){
        int totalApproved = 0;
        for (Integer result : results) {
            if(result > 5){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }

    private int countElementarySchoolStudentsApproved(Integer... results){
        int totalApproved = 0;
        for (Integer result : results) {
            if(result > 6){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }

    private int countHighSchoolStudentsApproved(Integer... results){
        int totalApproved = 0;
        for (Integer result : results) {
            if(result > 7){
                totalApproved = totalApproved + 1;
            }
        }
        return totalApproved;
    }

    /**
     * code smell -> Duplicated code
     *  What can go wrong? -> A change in the requirement, potentially involves changing all repeated methods,
     *                          stale and inconsistent methods is just a matter of time.
     */
}
