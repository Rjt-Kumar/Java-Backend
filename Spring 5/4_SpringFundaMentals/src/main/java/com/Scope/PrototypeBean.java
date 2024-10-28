package com.Scope;

public class PrototypeBean {

      private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrototypeBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
