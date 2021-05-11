package com.tw.neev;

public class Square {
    private double side;

    public Square(double side) {
        isValidParameters();
        this.side = side;
    }

    public double Area() {
        return side * side;
    }

    public double Perimeter() {
        return 4 * side;
    }

    public void isValidParameters() {
        if (side <= 0)
            try {
                throw new InvalidDimension("Side should be greater than zero");
            } catch (InvalidDimension invalidDimension) {
                invalidDimension.printStackTrace();
            }
    }
}
