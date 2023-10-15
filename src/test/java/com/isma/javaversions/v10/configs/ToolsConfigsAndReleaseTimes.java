package com.isma.javaversions.v10.configs;

import org.junit.jupiter.api.Test;

public class ToolsConfigsAndReleaseTimes {

    @Test
    public void dockerConfigs(){
    /*
        -XX:-UseContainerSupport
        -XX:ActiveProcessorCount=count
        -XX:InitialRAMPercentage
        -XX:MaxRAMPercentage
        -XX:MinRAMPercentage
     */
    }

    @Test
    public void openSourceRootCerts(){
        /*
        Before
            security protocols not working by default as certs not provided by default on jdk
         */

        /*
        After
            Security protocols working by default as certs are provided by default on jdk
                example: TLS

            /home/isma/.jdks/openjdk-20.0.2/lib/security/cacerts
         */
    }

    @Test
    public void releaseVersionsTiming(){
        /*
        *
        * Feature release -> A new Java release every six months
        *   Support for the feature release until next release happens (6 months),
        *
        * Long-term support release (LTS) -> An specific feature release
        *   Support for LTS until next release happens (some years)
        *       LTS release every 3 years from java 10 to 17
        *       LTS release every 2 years from java 17 onwards
        *
        *  --------------------------------------------------------------
        *       $ java -version
        *       > openjdk version "19.0.2" 2023-01-17
        * --------------------------------------------------------------
        *
        * */
    }
}
