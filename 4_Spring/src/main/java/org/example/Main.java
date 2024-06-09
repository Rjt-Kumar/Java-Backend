package org.example;


import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            Vehicle obj = (Vehicle) context.getBean("vehicle");
            obj.drive();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}