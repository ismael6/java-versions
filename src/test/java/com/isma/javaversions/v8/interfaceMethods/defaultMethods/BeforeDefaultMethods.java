package com.isma.javaversions.v8.interfaceMethods.defaultMethods;

import org.junit.jupiter.api.Test;

public class BeforeDefaultMethods {

    interface Car{
        int getMaxSpeed();

        //new requirement
        //double getMaxSpeedOnMilesPerHour();
    }

    class Bus implements Car{

        @Override
        public int getMaxSpeed() {
            return 180;
        }
    }

    class Sedan implements Car{

        @Override
        public int getMaxSpeed() {
            return 200;
        }
    }

    @Test
    public void newInterfaceMethodsAlwaysForceClientsToChange(){
        Car bus = new Bus();
        System.out.println(bus.getMaxSpeed());
    }
}
