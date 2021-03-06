package com.tw.neev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class RectangleTest {
    @Test
    public void shouldReturnOneWhenBothParametersEqualsToOne() {

        Rectangle rectangle = new Rectangle(1, 1);
        double expectedArea = 1;

        double actualArea = rectangle.area();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnPositiveValueWhenBothParametersPositive() {

        Rectangle rectangle = new Rectangle(5, 5);
        double expectedArea = 25;

        double actualArea = rectangle.area();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnDecimalWhenDecimalParameters() {
        Rectangle rectangle = new Rectangle(5.5, 5);
        double expectedArea = 27.5;

        double actualArea = rectangle.area();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldRiseExceptionWhenPassLessThanOneAsLength() {
        Executable executable = () -> new Rectangle(-1, 5);
        Assertions.assertThrows(InvalidDimensionException.class, executable);
    }

    @Test
    void shouldRiseExceptionWhenPassLessThanOneAsWidth() {
        Executable executable = () -> new Rectangle(1, -5);
        Assertions.assertThrows(InvalidDimensionException.class, executable);
    }

    @Test
    public void shouldReturnFourWhenBothParametersEqualsToOne() {

        Rectangle rectangle = new Rectangle(1, 1);
        double expectedPerimeter = 4;

        double actualPerimeter = rectangle.perimeter();

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void shouldReturnPositiveValueWhenBothParameterPositive() {

        Rectangle rectangle = new Rectangle(5, 5);
        double expectedPerimeter = 20;

        double actualPerimeter = rectangle.perimeter();

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void shouldReturnDecimalWhenDecimalParameter() {
        Rectangle rectangle = new Rectangle(5.5, 5);
        double expectedPerimeter = 21;

        double actualPerimeter = rectangle.perimeter();

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void shouldReturnPositiveInfinityWhenPassingGreaterThanMaxValueForArea() {

        Rectangle rectangle = new Rectangle(Double.MAX_VALUE, Double.MAX_VALUE);
        double expectedArea = Double.POSITIVE_INFINITY;

        double actualArea = rectangle.area();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void shouldReturnPositiveInfinityWhenPassingGreaterThanMaxValueForPerimeter() {

        Rectangle rectangle = new Rectangle(Double.MAX_VALUE, Double.MAX_VALUE);
        double expectedPerimeter = Double.POSITIVE_INFINITY;

        double actualPerimeter = rectangle.perimeter();

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }


}
