public class Rectangle implements Shapes {
    private double length;
    private double breadth;
    private double area;

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea() {
        return length*breadth;
    }
}
