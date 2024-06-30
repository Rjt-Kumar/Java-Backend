package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWiredDriver {

     private ConstAutowired constAutowired;
     private SetterAutowired setterAutowired;
     @Autowired
     private PropAutowired propAutowired;


    public SetterAutowired getSetterAutowired() {
        return setterAutowired;
    }
    @Autowired
    public void setSetterAutowired(SetterAutowired setterAutowired) {
        this.setterAutowired = setterAutowired;
    }

    @Autowired
    public AutoWiredDriver(ConstAutowired constAutowired){
         this.constAutowired = constAutowired;
    }

    public String toString(){
         return "ConstAutowired " + constAutowired + " SetterAutowired  : " + setterAutowired + " PropAutowired : " + propAutowired ;
    }

}
