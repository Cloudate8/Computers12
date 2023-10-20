package com.cloudate9.module1.part2;

public class Triangle extends TwoDShape {

    // These are not initialized if the constructor Triangle(double width, double height) is called
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        // Let this.side1 be the width of the triangle and heronsHeight to be its height
        super();

        // These need to come before heronsHeight is called because it uses them
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // Manually assign base and height;
        setWidth(side1);
        setHeight(heronsHeight());
    }

    private double heronsHeight() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return 0; // A triangle with a negative or zero side has no height
        }

        // Formula taken from https://www.youtube.com/watch?v=a1PR9O1Va84
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        if (area <= 0 || Double.isNaN(area)) {
            return 0; // A triangle with a negative or zero area has no height cause it's not a triangle
        }

        double h = 2 * area / super.width;
        return h;
    }

    @Override
    public double getArea() {
        if (super.width <= 0 || super.height <= 0) {
            return 0; // A triangle with a negative or zero base or height has no area
        }
        return 0.5 * super.width * super.height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + super.width +
                ", height=" + super.height +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + getArea() +
                '}';
    }
}
