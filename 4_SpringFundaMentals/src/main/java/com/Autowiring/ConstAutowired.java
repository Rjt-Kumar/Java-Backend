package com.Autowiring;

public class ConstAutowired {

     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstAutowired{" +
                "name='" + name + '\'' +
                '}';
    }
}
