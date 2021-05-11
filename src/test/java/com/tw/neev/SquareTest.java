package com.tw.neev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class SquareTest {

    @Test
    void shouldReturnUnitValueWhenParameterUnit() {
        Square square = new Square(1);
        double expectedArea = 1;
        double actualArea = square.Area();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnPositiveValueWhenParametersPositive() {
        Square square = new Square(5);
        double expectedArea = 25;
        double actualArea = square.Area();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnFourValueWhenParameterUnit() {
        Square square = new Square(1);
        double expectedPerimeter = 4;
        double actualPerimeter = square.Perimeter();
        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void shouldReturnPositiveValueWhenParameterPositive() {
        Square square = new Square(5);
        double expectedPerimeter = 20;
        double actualPerimeter = square.Perimeter();
        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }


    @Test
    void shouldRiseExceptionWhenPassLessThanOneAsSide() {
        Executable executable = () -> new Square(-1);
        Assertions.assertThrows(InvalidDimension.class, executable);
    }
}
