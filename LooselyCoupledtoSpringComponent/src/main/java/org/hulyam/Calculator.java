package org.hulyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    // Square shape;
    @Autowired
    @Qualifier("rectangular")
    IShape shape;

    public void calculate() {
        System.out.println("Calculate method is running for the shape... " + shape);
        shape.calculateArea();
        shape.calculatePerimeter();
        shape.calculateVolume();
    }
}
