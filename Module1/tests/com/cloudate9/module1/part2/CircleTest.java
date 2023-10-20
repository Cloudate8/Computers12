package com.cloudate9.module1.part2;

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
        double delta = 0.000000001;

        Circle postiveCircle = new Circle(10);
        assertEquals(314.1592653589793, postiveCircle.getArea(), delta);

        Circle zeroCircle = new Circle(0);
        assertEquals(0.0, zeroCircle.getArea(), delta);

        Circle negativeCircle = new Circle(-10);
        assertEquals(0.0, negativeCircle.getArea(), delta);

        Circle maxDoubleCircle = new Circle(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, maxDoubleCircle.getArea(), delta);

        Circle minDoubleCircle = new Circle(Double.MIN_VALUE);
        assertEquals(0.0, minDoubleCircle.getArea(), delta);
    }
}