package com.LifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/LifeCycleBean.xml");
        context.registerShutdownHook();
//        XMLBean bean = (XMLBean) context.getBean("XMLBean");
//        System.out.println(bean);
////        bean.init();
//        System.out.println("=....+>........+........++>>>>++++++>>>>>>");
//        InterfaceBean bean2 = (InterfaceBean) context.getBean("InterfaceBean");
//
//        System.out.println(bean2);
//        System.out.println("=....+>........+........++>>>>++++++>>>>>>");

        AnnotBean bean3 = context.getBean("AnnotBean",AnnotBean.class);

        System.out.println(bean3);

    }
}   
