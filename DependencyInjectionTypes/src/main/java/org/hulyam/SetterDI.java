package org.hulyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SetterService{
    // Setter Dependency Injection
    SetterDependency1 dependency1;
    SetterDependency2 dependency2;

    @Autowired
    public void setDependency1(SetterDependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(SetterDependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "SetterService{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class SetterDependency1{

}

@Component
class SetterDependency2{

}

@Configuration
@ComponentScan
public class SetterDI {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SetterDI.class);

        // All beans controlled by Spring
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("========================================================");
        System.out.println(context.getBean(SetterService.class));

    }
}
