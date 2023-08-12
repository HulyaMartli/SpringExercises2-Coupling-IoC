package org.hulyam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfiguration {
    // SOLUTION 2
    @Bean
    public IShape shape() {
        return new Square();
    }

    @Bean
    public Calculator calculator(IShape shape) {
        return new Calculator(shape);
    }


    // MY SOLUTION
   /* @Bean
    @Qualifier("square")
    public Square square(){
        return new Square();
    }

    @Bean
    @Primary
    public Triangle triangle(){
        return new Triangle();
    }

    @Bean
    public Rectangular rectangular(){
        return new Rectangular();
    }

    @Bean
    public Calculator calculator1(){
        return new Calculator(rectangular());
    } // RETURNS RECTANGULAR - METHOD CALLING

    @Bean
    public Calculator calculator2(@Qualifier("square") IShape shape){
        return new Calculator(shape);
    } // RETURNS SQUARE - QUALIFIER

    @Bean
    public Calculator calculator3(IShape shape){
        return new Calculator(shape);
    } // RETURNS TRIANGLE SINCE IT'S PRIMARY*/
}
