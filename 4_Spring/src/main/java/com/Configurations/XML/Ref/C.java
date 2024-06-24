package com.Configurations.XML.Ref;

public class C {

    private String name;
   private  A objec;
    public String getName() {
        return name;
    }

    public A getObjec() {
        return objec;
    }

    public void setObjec(A obje) {
        this.objec = obje;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + "and alos " + objec.getX();
    }
}
