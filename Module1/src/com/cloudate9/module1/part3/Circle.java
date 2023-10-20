package com.cloudate9.module1.part3;

public class Circle extends TwoDShape {

    public final double PI = 3.141592653589;
    private double radius;

    public Circle(double radius) {
        // The radius is half of the width and height. To get width and height, multiply radius by 2 (diameter)
        super(2 * radius, 2 * radius);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius <= 0.0) {
            return 0; // A circle with a negative or zero radius has no area
        }
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + super.width +
                ", height=" + super.height +
                ", PI=" + PI +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}
