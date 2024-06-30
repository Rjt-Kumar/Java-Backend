package com.Autowiring;

public class Emp {

    private Address add;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp(){
        super();
    }

    public Address getAddress() {
        return add;
    }

    public void setAddress(Address address) {
        this.add = address;
    }

    public String toString(){
        return "THe address of "  + name + " is "+ add;
     }
}
