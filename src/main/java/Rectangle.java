public class Rectangle implements Shapes {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        isValidParameters();
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
            return length * breadth;
    }

    public double perimeter() {
            return 2 * (length + breadth);
    }

    public void isValidParameters() {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Length and breadth should be positive values");
        }
    }
}




    /*public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        try {
            if (length <= 0 || breadth <= 0) {
                throw new IllegalArgumentException("Length and breadth should be positive values");
            }
        } catch (Exception IllegalArgumentException) {}
    }

    public double area() {
            return length * breadth;
    }

    public double perimeter() {
            return 2 * (length + breadth);
    }

    }
}*/
