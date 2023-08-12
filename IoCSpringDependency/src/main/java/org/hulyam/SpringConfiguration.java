package org.hulyam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {
};

record Address(String city, String country) {
};

record Person2(String name, int yas, Address address) {
};

@Configuration
public class SpringConfiguration {

    // @Bean anotasyonu ile Spring Context tarafından yönetilecek bir bean oluşturuluyor.
    @Bean
    public String name() {
        return "Mr. Bean";
    }

    @Bean
    public int age() {
        return 50;
    }

    @Bean
    public Person person() {
        return new Person("Hulya", 32);
    }

    @Bean("addr.")
    public Address address() {
        return new Address("Los Angeles", "USA");
    }

    @Bean
    public Person personMethodCalling() {
        return new Person(name(), age());
    }

    @Bean
    public Person2 person2() {
        return new Person2("Nihal", 40, new Address("Istanbul", "Turkiye"));
    }

    @Bean
    public Person2 person2MethodCalling() {
        return new Person2(name(), age(), address());
    }

    @Bean
    @Primary
    public Address address2() {
        return new Address("Ankara", "Turkiye");
    }

    @Bean
    @Qualifier("romeQualifier")
    public Address address3() {
        return new Address("Rome", "Italy");
    }

    @Bean
    public Person2 person2Qualifier(String name, int age, @Qualifier("romeQualifier") Address address) {
        return new Person2(name, age, address);
    }
}
