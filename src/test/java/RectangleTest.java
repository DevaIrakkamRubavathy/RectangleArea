import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldReturnOneWhenWidthAndHeightEqualToOne(){
        //Given
        Rectangle rectangle=new Rectangle();
        double expected=1;
        //When
        double actual=rectangle.area(1,1);
        //Then
        Assertions.assertEquals(actual,expected);
    }
}
