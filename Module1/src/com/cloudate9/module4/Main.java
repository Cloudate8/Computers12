package com.cloudate9.module4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3, 4, 5, Colour.RED));
        shapes.add(new Circle(5, Colour.BLUE));
        shapes.add(new Triangle(6, 8, 10, Colour.GREEN));
        shapes.add(new Circle(10, Colour.RED));
        shapes.add(new Triangle(9, 12, 15, Colour.NONE));

        for (TwoDShape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.getArea());
            System.out.println(shape);
        }

    }
}
