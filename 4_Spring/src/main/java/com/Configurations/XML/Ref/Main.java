package com.Configurations.XML.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        try {
            ApplicationContext contxt = new ClassPathXmlApplicationContext("RefConfig.xml");
            A obj = (A) contxt.getBean("aref");
//          B bref = (B)contxt.getBean("bref");

            System.out.println(obj.sum());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
