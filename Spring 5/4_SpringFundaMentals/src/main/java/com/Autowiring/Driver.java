package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) throws  Exception {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/AutoWirnig.xml");
        context.registerShutdownHook();

//        Address add = context.getBean("address",Address.class);
////        System.out.println(add);
//
//        Emp emp = context.getBean("Emp",Emp.class);
//
//        System.out.println(emp);

        AutoWiredDriver auto = context.getBean("auto",AutoWiredDriver.class);

        System.out.println(auto);
    }
}
