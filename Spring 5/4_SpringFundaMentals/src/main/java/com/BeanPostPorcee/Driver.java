package com.BeanPostPorcee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        try{

            AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/BeanPostPro/configure.xml");
            context.registerShutdownHook();
            Car car = context.getBean("car",Car.class);



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
