package com.tw.neev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class SquareTest {

    @Test
    void shouldReturnPositiveValueWhenParametersPositive() {
        Square square = new Square(5);
        double expectedArea = 25;
        double actualArea = square.Area();
        Assertions.assertEquals(expectedArea, actualArea);
    }
   /* @Test
    void shouldRiseExceptionWhenPassLessThanOneAsSide() {
        Executable executable = () -> new Square(-1);
        Assertions.assertThrows(NegativeLengthAndBreadth.class,executable);
    }*/
}
