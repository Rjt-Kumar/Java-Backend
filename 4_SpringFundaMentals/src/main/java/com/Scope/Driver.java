package com.Scope;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/scope.xml");
        context.registerShutdownHook();

        SingletonBean first = (SingletonBean) context.getBean("Single");
        SingletonBean second = (SingletonBean) context.getBean("Single");

        System.out.println("Comparing the Singleton Bean " + (first==second));

        PrototypeBean firstPro = (PrototypeBean) context.getBean("Pro");
        PrototypeBean secondPro = (PrototypeBean) context.getBean("Pro");

        System.out.println("Comparing the Prototype beans " + (firstPro==secondPro));
//
//        RequestBean firstReq = (RequestBean) context.getBean("Req");
//        RequestBean secondReq = (RequestBean) context.getBean("Req");
//
//        System.out.println("Comparing the Request Bean "+ (firstReq==secondReq));
//
//        SessionBean firstSes = (SessionBean) context.getBean("Sess");
//        SessionBean secondSes = (SessionBean) context.getBean("Sess");
//
//        System.out.println("Comparing the Session Beans  "+ (firstSes==secondSes));

    }
}
