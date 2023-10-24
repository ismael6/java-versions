package com.isma.javaversions.v11;

import jakarta.annotation.Nonnull;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class VarInLambdaBindingVariable {

    @Test
    public void VarInLambdaBindingVariable(){
        Predicate<Integer> isAdult = (@Nonnull var n) -> n > 18;
    }
}
