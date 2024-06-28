package com.Scope;

public class SessionBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SessionBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
