package com.cloudate9.module1.part2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    /**
     * Tests the getArea method when base or height is positive negative, zero, max double, and min double.
     */
    @Test
    public void testGetAreaBaseHeight() {
        Triangle allPositiveTriangle = new Triangle(10, 10);
        assertEquals(50.0, allPositiveTriangle.getArea(), 0.000000001);

        Triangle allNegativeTriangle = new Triangle(-10, -10);
        assertEquals(0.0, allNegativeTriangle.getArea(), 0.000000001);

        Triangle baseNegativeTriangle = new Triangle(-10, 10);
        assertEquals(0.0, baseNegativeTriangle.getArea(), 0.000000001);

        Triangle heightNegativeTriangle = new Triangle(10, -10);
        assertEquals(0.0, heightNegativeTriangle.getArea(), 0.000000001);

        Triangle allZeroTriangle = new Triangle(0, 0);
        assertEquals(0.0, allZeroTriangle.getArea(), 0.000000001);

        Triangle baseZeroTriangle = new Triangle(0, 10);
        assertEquals(0.0, baseZeroTriangle.getArea(), 0.000000001);

        Triangle heightZeroTriangle = new Triangle(10, 0);
        assertEquals(0.0, heightZeroTriangle.getArea(), 0.000000001);

        Triangle allMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, allMaxDoubleTriangle.getArea(), 0.000000001);

        Triangle baseMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, 10);
        assertEquals(Double.POSITIVE_INFINITY, baseMaxDoubleTriangle.getArea(), 0.000000001);

        Triangle heightMaxDoubleTriangle = new Triangle(10, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, heightMaxDoubleTriangle.getArea(), 0.000000001);

        Triangle allMinDoubleTriangle = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(0.0, allMinDoubleTriangle.getArea(), 0.000000001);

        Triangle baseMinDoubleTriangle = new Triangle(Double.MIN_VALUE, 10);
        assertEquals(0.0, baseMinDoubleTriangle.getArea(), 0.000000001);

        Triangle heightMinDoubleTriangle = new Triangle(10, Double.MIN_VALUE);
        assertEquals(0.0, heightMinDoubleTriangle.getArea(), 0.000000001);
    }

    /**
     * Tests the getArea method when sides are positive negative, zero, max double, and min double, or invalid
     */
    @Test
    public void testGetAreaSides() {
        Triangle allPositiveTriangle = new Triangle(10, 10, 10);
        assertEquals(43.3012701892, allPositiveTriangle.getArea(), 0.000000001);

        Triangle allNegativeTriangle = new Triangle(-10, -10, -10);
        assertEquals(0.0, allNegativeTriangle.getArea(), 0.000000001);

        Triangle side1NegativeTriangle = new Triangle(-10, 10, 10);
        assertEquals(0.0, side1NegativeTriangle.getArea(), 0.000000001);

        Triangle side2NegativeTriangle = new Triangle(10, -10, 10);
        assertEquals(0.0, side2NegativeTriangle.getArea(), 0.000000001);

        Triangle side3NegativeTriangle = new Triangle(10, 10, -10);
        assertEquals(0.0, side3NegativeTriangle.getArea(), 0.000000001);

        Triangle allZeroTriangle = new Triangle(0, 0, 0);
        assertEquals(0.0, allZeroTriangle.getArea(), 0.000000001);

        Triangle side1ZeroTriangle = new Triangle(0, 10, 10);
        assertEquals(0.0, side1ZeroTriangle.getArea(), 0.000000001);

        Triangle side2ZeroTriangle = new Triangle(10, 0, 10);
        assertEquals(0.0, side2ZeroTriangle.getArea(), 0.000000001);

        Triangle side3ZeroTriangle = new Triangle(10, 10, 0);
        assertEquals(0.0, side3ZeroTriangle.getArea(), 0.000000001);

        Triangle allMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, allMaxDoubleTriangle.getArea(), 0.000000001);

        Triangle allMinDoubleTriangle = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(0.0, allMinDoubleTriangle.getArea(), 0.000000001);

        // Tests when no side is greater than S in heron's formula
        Triangle invalidTriangle = new Triangle(1, 2, 3);
        assertEquals(0.0, invalidTriangle.getArea(), 0.000000001);

        // Tests when a side is greater than S in heron's formula
        Triangle invalidTriangle2 = new Triangle(1, 2, 4);
        assertEquals(0.0, invalidTriangle2.getArea(), 0.000000001);
    }
}