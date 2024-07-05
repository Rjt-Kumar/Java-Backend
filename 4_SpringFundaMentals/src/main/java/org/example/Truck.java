package org.example;



public class Truck {
   private String tankCap;

    public Truck(String tankCap){
        this.tankCap =tankCap;
    }

    public void setTankCap(String a){
        this.tankCap = a;
    }
    public String getTankCap(){
        return tankCap;
    }
    public void drive(){
        System.out.println("This vehicle have "+ tankCap );
    }
}
