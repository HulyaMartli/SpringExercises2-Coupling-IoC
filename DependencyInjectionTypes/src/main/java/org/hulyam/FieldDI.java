package org.hulyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Service{
    // Field Dependency Injection
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;


    @Override
    public String toString() {
        return "Service{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class FieldDI {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(FieldDI.class);

        // All beans controlled by Spring
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("========================================================");
        System.out.println(context.getBean(Service.class));

    }
}