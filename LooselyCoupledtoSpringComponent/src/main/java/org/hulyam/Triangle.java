package org.hulyam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Triangle implements IShape {
    public void calculateArea() {
        System.out.println("The area of the Triangle is calculated...");
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter of the Triangle is calculated...");
    }

    public void calculateVolume() {
        System.out.println("The volume of the Triangle is calculated...");
    }
}
