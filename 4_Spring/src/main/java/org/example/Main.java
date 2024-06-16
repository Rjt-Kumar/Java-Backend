package org.example;


import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.VetoableChangeListener;

public class Main {
    public static void main(String[] args) {

        try {
             ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

            Truck truck = (Truck)context.getBean("vehicle");
             truck.drive();
//            System.out.printf(vehicle.tank);


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}