package org.hulyam;

public class Calculator {
    // Square shape;
    Triangle shape;

    public Calculator(Triangle shape) {
        this.shape = shape;
    }

    public void calculate() {
        System.out.println("Calculate method is running for the shape... " + shape);
        shape.calculateArea();
        shape.calculatePerimeter();
        shape.calculateVolume();
    }
}
