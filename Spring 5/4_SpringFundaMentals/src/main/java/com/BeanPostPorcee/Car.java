package com.BeanPostPorcee;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.management.DescriptorKey;

public class Car implements DisposableBean {

    private String engine;


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        System.out.println("Injecting Values");
        this.engine = engine;
    }

    @PostConstruct
    public void init(){
        System.out.println("This is the init Method");
    }
    @Override
    public void destroy(){
        System.out.println("This is the Destroy Method ");
    }


}
