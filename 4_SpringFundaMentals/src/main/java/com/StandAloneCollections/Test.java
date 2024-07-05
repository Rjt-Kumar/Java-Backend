package com.StandAloneCollections;

import com.Configurations.XML.Ref.A;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.EscapedErrors;

public class Test {

    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/StandAlone/alone_config.xml");
        context.registerShutdownHook();

        Person per = context.getBean("stand",Person.class);

        System.out.println(per);

    }
}
