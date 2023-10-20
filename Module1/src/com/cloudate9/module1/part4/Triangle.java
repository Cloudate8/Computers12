package com.cloudate9.module1.part4;

/**
 * Represents a triangle
 */
public class Triangle extends TwoDShape implements Rotate {

    // These are not initialized if the constructor Triangle(double width, double height, Colour colour) is called
    double side1;
    double side2;
    double side3;
    private double angle = 0;

    /**
     * Creates a triangle with the given width, height and colour
     *
     * @param width  the width of the triangle
     * @param height the height of the triangle
     * @param colour the colour of the triangle
     */
    public Triangle(double width, double height, Colour colour) {
        super(width, height, colour);
    }

    /**
     * Creates a triangle with the given sides and colour
     *
     * @param side1  the first side of the triangle
     * @param side2  the second side of the triangle
     * @param side3  the third side of the triangle
     * @param colour the colour of the triangle
     */
    public Triangle(double side1, double side2, double side3, Colour colour) {
        // Let this.side1 be the width of the triangle and heronsHeight to be its height
        super(colour);

        // These need to come before heronsHeight is called because it uses them
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // Manually assign base and height;
        setWidth(side1);
        setHeight(heronsHeight());
    }

    /**
     * Get the height of the triangle using Heron's formula <a href="https://www.youtube.com/watch?v=a1PR9O1Va84">https://www.youtube.com/watch?v=a1PR9O1Va84</a>
     *
     * @return the height of the triangle
     */
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

        double h = 2 * area / side1;
        return h;
    }

    /**
     * Get the area of the triangle, using the formula 1/2 * base * height
     *
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        if (super.width <= 0 || super.height <= 0) {
            return 0; // A triangle with a negative or zero base or height has no area
        }
        return 0.5 * super.width * super.height;
    }

    /**
     * Get the string representation of the triangle, including all of its fields
     *
     * @return the string representation of the triangle
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + super.width +
                ", height=" + super.height +
                ", colour=" + super.colour +
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
