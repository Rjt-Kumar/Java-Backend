package com.Configurations.XML.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("Ambiguity.xml");
        Addition add = (Addition) context.getBean("Add");
        System.out.printf(add.toString());
    }
}
