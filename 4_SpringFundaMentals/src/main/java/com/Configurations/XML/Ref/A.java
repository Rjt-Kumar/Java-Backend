package com.Configurations.XML.Ref;

public class A {

      private int x;

      private B obj;

      public A(int x,B obj){
          this.x = x;
          this.obj = obj;
      }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int sum(){
        return x+obj.getY();
    }
}
