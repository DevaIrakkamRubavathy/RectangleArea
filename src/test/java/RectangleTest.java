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
    void shouldReturnPositiveValueWhenBothPositive() {

        Rectangle rectangle = new Rectangle(5, 5);
        double expectedArea = 25;

        double actualArea = rectangle.getArea();

        Assertions.assertEquals(expectedArea, actualArea);
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
