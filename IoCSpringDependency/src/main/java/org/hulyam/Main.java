package org.hulyam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // SpringConfiguration dosyasında oluşturduğumuz beane ulaşmaya çalışıyoruz.
        // Spring Context'i oluşturmak için kullanılır, içine class olarak ayar dosyası verilir:
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // BEAN CALLS
        // With Method Names
        System.out.println(context.getBean("name")); //same as the method name in SpringConfiguration.class
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("addr."));
        System.out.println(context.getBean("personMethodCalling"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person2MethodCalling"));
        System.out.println(context.getBean("person2Qualifier"));

        // With Class Names
        System.out.println(context.getBean(Address.class));
    }
}