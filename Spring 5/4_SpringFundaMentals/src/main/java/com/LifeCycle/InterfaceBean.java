package com.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceBean implements InitializingBean, DisposableBean {

    private String name;

    public InterfaceBean() {
        super();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Second Bean is getting destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Method of Second Bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("II'n Bean name Injection");
        this.name = name;
    }

    @Override
    public String toString() {
        return "InterfaceBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
