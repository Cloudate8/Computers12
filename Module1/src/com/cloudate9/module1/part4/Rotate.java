package com.cloudate9.module1.part4;

/**
 * Interface for shapes that can rotate
 */
public interface Rotate {

    /**
     * Rotates the shape 90 degrees clockwise
     */
    void rotate90();

    /**
     * Rotates the shape 180 degrees clockwise
     */
    void rotate180();

    /**
     * Rotates the shape by the specified number of degrees clockwise
     *
     * @param degree the number of degrees to rotate the shape
     */
    void rotate(double degree);

}
