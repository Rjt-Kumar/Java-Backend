package com.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MethodDemo {

     @Value("#{4}")
     private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Value("#{T(java.lang.Math).pow(2,8)}")
    private double pow;

    public double getPow() {
        return pow;
    }

    @Override
    public String toString() {
        return "The value of " + a + " to the power of 2 is " + pow;

    }

    public void setPow(double pow) {
        this.pow = pow;
    }
}
