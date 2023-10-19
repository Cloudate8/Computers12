package com.cloudate9.module1.part4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getArea() {
        Circle postiveCircle = new Circle(10, Colour.BLUE);
        assertEquals(314.1592653589793, postiveCircle.getArea(), 0.000000001);
        Circle zeroCircle = new Circle(0, Colour.BLUE);
        assertThrows(IllegalArgumentException.class, zeroCircle::getArea);
        Circle negativeCircle = new Circle(-10, Colour.BLUE);
        assertThrows(IllegalArgumentException.class, negativeCircle::getArea);
        Circle maxDoubleCircle = new Circle(Double.MAX_VALUE, Colour.BLUE);
        assertEquals(Double.POSITIVE_INFINITY, maxDoubleCircle.getArea(), 0.000000001);
        Circle minDoubleCircle = new Circle(Double.MIN_VALUE, Colour.BLUE);
        assertThrows(IllegalArgumentException.class, minDoubleCircle::getArea);
    }
}