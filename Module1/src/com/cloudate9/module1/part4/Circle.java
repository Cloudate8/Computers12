package com.cloudate9.module1.part4;

/**
 * Represents a circle
 */
public class Circle extends TwoDShape {

    public final double PI = 3.141592653589;
    private double radius;

    /**
     * Default constructor
     * @param radius the radius of the circle
     * @param colour the colour of the circle
     */
    public Circle(double radius, Colour colour) {
        // The radius is half of the width and height. To get width and height, multiply radius by 2 (diameter)
        super(2 * radius, 2 * radius, colour);
        this.radius = radius;
    }

    /**
     * Get the area of the circle, using the formula PI * radius^2
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    /**
     * Get the string representation of the circle, including all of its fields
     * @return the string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle{" +
                "width=" + super.width +
                ", height=" + super.height +
                ", colour=" + super.colour +
                ", PI=" + PI +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}