package com.cloudate9.module1;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        // Let this.side1 be the width of the triangle and heronsHeight to be its height
        super();
        // Manually assign base and height;
        super.width = side1;
        super.height = heronsHeight();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double h = 2 * area / side1;
        return h;
    }

    @Override
    public double getArea() {
        return 0.5 * super.width * super.height;
    }
}
