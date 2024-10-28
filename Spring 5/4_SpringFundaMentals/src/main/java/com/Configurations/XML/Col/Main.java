package com.Configurations.XML.Col;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("Collectionsconfig.xml");
            Student student = (Student) context.getBean("student1");
            System.out.println(student.getMap() + " " );
//            System.out.printf(student.getName());
            System.out.println(student);
        }catch(Exception e){

            System.out.printf(e.getMessage());
        }
    }
}
