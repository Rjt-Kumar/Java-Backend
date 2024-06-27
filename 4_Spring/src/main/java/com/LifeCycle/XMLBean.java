package com.LifeCycle;

public class XMLBean {

    private String name;
    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("I'st Bean price Injection");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I'st Bean Name Injection ");
        this.name = name;
    }

    @Override
    public String toString() {
        return "XMLBean{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void init(){
        System.out.println("So this the Init Method");
    }

    public void destroy(){
        System.out.println("So this is the destroy Method");
    }
}
