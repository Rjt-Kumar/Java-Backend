package com.Autowiring;

public class PropAutowired {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PropAutowired{" +
                "name='" + name + '\'' +
                '}';
    }
}
