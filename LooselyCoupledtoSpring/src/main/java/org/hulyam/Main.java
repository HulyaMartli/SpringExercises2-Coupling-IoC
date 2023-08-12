package org.hulyam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        // SOLUTION 2
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        context.getBean(Calculator.class).calculate();

        // MY SOLUTION
        /*var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Calculator calculator1 = context.getBean("calculator1",Calculator.class);
        calculator1.calculate();
        System.out.println("=========================================================");
        Calculator calculator2 = context.getBean("calculator2",Calculator.class);
        calculator2.calculate();
        System.out.println("=========================================================");
        Calculator calculator3 = context.getBean("calculator3",Calculator.class);
        calculator3.calculate();
        System.out.println("=========================================================");*/
    }
}