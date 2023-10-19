package com.cloudate9.module1.part3;

public class Triangle extends TwoDShape implements Rotate {

    // These are not initialized if the constructor Triangle(double width, double height) is called
    double side1;
    double side2;
    double side3;
    private double angle = 0;

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
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double h = 2 * area / side1;
        return h;
    }

    @Override
    public double getArea() {
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
                ", angle=" + angle +
                '}';
    }

    @Override
    public void rotate90() {
        rotate(90);
    }

    @Override
    public void rotate180() {
        rotate(180);
    }

    @Override
    public void rotate(double degree) {
        angle += degree;
        // Ensure that angle is 0 <= angle < 360
        angle %= 360;
    }
}
