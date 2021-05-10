import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldReturnOneWhenWidthAndHeightEqualsToOne() {

        Rectangle rectangle = new Rectangle(1, 1);
        double expectedArea = 1;

        double actualArea = rectangle.getArea();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnPositiveValueWhenBothParametersPositive() {

        Rectangle rectangle = new Rectangle(5, 5);
        double expectedArea = 25;

        double actualArea = rectangle.getArea();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnDecimalWhenDecimalParameters() {
        Rectangle rectangle = new Rectangle(5.5, 5);
        double expected = 27.5;

        double actual = rectangle.getArea();

        Assertions.assertEquals(expected, actual);
    }
    /*
    - Binding the data with the test
    - assertEquals(expected, actual)
    - better naming convention
    - remove comment
    - method name should be generalize
    3 == 5
    5 == 3

    unit value
    positive value
     */
}
