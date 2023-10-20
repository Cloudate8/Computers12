package com.cloudate9.module1.part4;

/**
 * Represents a 2D shape
 */
public abstract class TwoDShape {
    private double width;
    private double height;
    Colour colour;

    /**
     * This constructor is used to create a shape with a given width, height, and colour
     *
     * @param width  the width of the shape
     * @param height the height of the shape
     * @param colour the colour of the shape
     */
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    /**
     * This constructor is used to create a shape with the given colour.
     * NOTE THAT THE WIDTH AND HEIGHT ARE NOT SET AND WILL HAVE TO BE DONE MANUALLY
     *
     * @param colour the colour of the shape
     */
    public TwoDShape(Colour colour) {
        this.colour = colour;
    }

    /**
     * Gets the width of the shape
     *
     * @return the width of the shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the shape
     *
     * @param width the new width of the shape
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the shape
     *
     * @return the height of the shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the shape
     *
     * @param height the new height of the shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the colour of the shape
     *
     * @return the colour of the shape
     */
    public Colour getColour() {
        return colour;
    }

    /**
     * Sets the colour of the shape
     *
     * @param colour the new colour of the shape
     */
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    /**
     * This method calculates the area of the shape using its area formula
     * This method is abstract because each shape has a different formula for calculating its area
     *
     * @return the area of the shape
     */
    public abstract double getArea();

}
