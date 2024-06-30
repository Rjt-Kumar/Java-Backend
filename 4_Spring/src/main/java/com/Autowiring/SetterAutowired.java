package com.Autowiring;

public class SetterAutowired {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SetterAutowired{" +
                "name='" + name + '\'' +
                '}';
    }
}
