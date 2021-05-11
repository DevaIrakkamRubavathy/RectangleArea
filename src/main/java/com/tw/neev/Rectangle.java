public class Rectangle implements Shapes {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) throws NegativeLengthAndBreadth{
        isValidParameters() ;
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
            return length * breadth;
    }

    public double perimeter() {
            return 2 * (length + breadth);
    }

    public void isValidParameters() throws NegativeLengthAndBreadth{
        if (length <= 0 || breadth <= 0) {
            throw new NegativeLengthAndBreadth("Length and Breadth should be greater than zero");
        }
    }
}