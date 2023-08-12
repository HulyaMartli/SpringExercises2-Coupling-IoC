package org.hulyam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangular")
public class Rectangular implements IShape {

    @Override
    public void calculateArea() {
        System.out.println("The area of the Rectangular is calculated...");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the Rectangular is calculated...");
    }

    @Override
    public void calculateVolume() {
        System.out.println("The volume of the Rectangular is calculated...");
    }
}
