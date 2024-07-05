package com.SterotypeAnnotations;

import com.Configurations.XML.Ref.C;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args){

        try {
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/SterotypeAnnot/Config.xml");
//            context.registerShutdownHook();

            Student student = context.getBean("student", Student.class);

            System.out.println(student);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
