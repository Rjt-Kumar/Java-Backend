package org.example;

public class Bike implements Vehicle{

    String tankCap;

    public Bike(String tankCap){
        this.tankCap = tankCap;
    }
    public void drive(){

        System.out.println("Bike is Running");
    }
}
