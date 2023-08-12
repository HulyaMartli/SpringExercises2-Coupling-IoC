package org.hulyam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ConstructorService{
    // Constructor Dependency Injection
    ConstructorDependency1 dependency1;
    ConstructorDependency2 dependency2;

    public ConstructorService(ConstructorDependency1 dependency1, ConstructorDependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Service{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class ConstructorDependency1{

}

@Component
class ConstructorDependency2{

}

@Configuration
@ComponentScan
public class ConstructorDI {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConstructorDI.class);

        // All beans controlled by Spring
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("========================================================");
        System.out.println(context.getBean(ConstructorService.class));

    }
}
