package com.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Injecting III'rd bean");
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnnotBean{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("This is the Init Method of III'rd bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("This is the destroy method of III'rd Bean");
    }
}
