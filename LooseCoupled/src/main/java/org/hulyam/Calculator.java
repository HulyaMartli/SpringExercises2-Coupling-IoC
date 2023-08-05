package org.hulyam;

public class Calculator {
    // Square shape;
    IShape shape;

    public Calculator(IShape shape) {
        this.shape = shape;
    }

    public void calculate() {
        System.out.println("Calculate method is running for the shape... " + shape);
        shape.calculateArea();
        shape.calculatePerimeter();
        shape.calculateVolume();
    }
}
