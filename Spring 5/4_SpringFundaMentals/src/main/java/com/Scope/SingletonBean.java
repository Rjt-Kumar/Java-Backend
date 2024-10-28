package com.Scope;

public class SingletonBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingletonBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
