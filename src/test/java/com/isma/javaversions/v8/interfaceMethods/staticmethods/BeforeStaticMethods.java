package com.isma.javaversions.v8.interfaceMethods.staticmethods;

import org.junit.jupiter.api.Test;

public class BeforeStaticMethods {

    private interface Employee {
        void eat();
    }

    private class Ceo implements Employee {
        @Override
        public void eat() {
            System.out.println("eating on a fancy restaurant");
        }
    }

    private class Godin implements Employee {
        @Override
        public void eat() {
            System.out.println("eating fast food lunch");
        }
    }

    private static class EmployeeUtils {
        public static void eatAtOnce(Employee... employees) {
            for(Employee p: employees){
                p.eat();
            }
        }
    }

    @Test
    public void scatteredUtilityMethods(){
        Employee ceo = new Ceo();
        Employee godin = new Godin();
        Employee godin2 = new Godin();
        EmployeeUtils.eatAtOnce(ceo, godin, godin2);
    }
}
