package com.cloudate9.module1.part4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Circle class
 */
public class CircleTest {

    /**
     * Tests the getArea method when radius is positive, negative, zero, max double, and min double.
     */
    @Test
    public void testGetArea() {
        // Test when radius is positive
        Circle postiveCircle = new Circle(10, Colour.BLUE);
        assertEquals(314.1592653589793, postiveCircle.getArea(), 0.000000001);

        Circle zeroCircle = new Circle(0, Colour.BLUE);
        assertEquals(0.0, zeroCircle.getArea(), 0.000000001);

        // Test when radius is negative
        Circle negativeCircle = new Circle(-10, Colour.BLUE);
        assertEquals(0.0, negativeCircle.getArea(), 0.000000001);

        Circle maxDoubleCircle = new Circle(Double.MAX_VALUE, Colour.BLUE);
        assertEquals(Double.POSITIVE_INFINITY, maxDoubleCircle.getArea(), 0.000000001);

        Circle minDoubleCircle = new Circle(Double.MIN_VALUE, Colour.BLUE);
        assertEquals(0.0, minDoubleCircle.getArea(), 0.000000001);
    }
}