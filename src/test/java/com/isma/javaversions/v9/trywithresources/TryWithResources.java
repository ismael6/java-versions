package com.isma.javaversions.v9.trywithresources;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {

    @Test
    public void before(final BufferedReader br) throws IOException{
        try(BufferedReader br1 = br){
            br1.readLine();
        }
    }


    @Test
    public void allowsToReuseFinalAutoClosableResource(final BufferedReader br) throws IOException {
        //br = new BufferedReader(new StringReader(""));
        try (br) {
            br.readLine();
        }
    }
}
