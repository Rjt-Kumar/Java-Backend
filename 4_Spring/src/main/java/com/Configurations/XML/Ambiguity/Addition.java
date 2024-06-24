package com.Configurations.XML.Ambiguity;

public class Addition {
    private int a;
    private int b;

    public Addition(int a,int b){
        this.a = a;
        this.b = b;

        System.out.printf("This is the (int,Int) constructor");
    }

    public Addition(double a ,double b){
        this.a = (int)a;
        this.b = (int)b;

        System.out.printf("This is the (double,double) constructor");
    }
    public Addition(String a,String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);

        System.out.printf("This is the (string,Sring) constructor");
    }

    public String toString(){
        return this.a + " " + this.b;
    }
}
