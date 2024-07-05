package com.Scope;

public class RequestBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RequestBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
