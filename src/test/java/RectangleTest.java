import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldReturnOneWhenBothParametersEqualsToOne() {

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
        double expectedArea = 27.5;

        double actualArea = rectangle.getArea();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldReturnZeroWhenPassZeroAsParameter() {
        Rectangle rectangle = new Rectangle(0, 5);
        double expectedArea = 0;

        double actualArea = rectangle.getArea();

        Assertions.assertEquals(expectedArea, actualArea);
    }
}
