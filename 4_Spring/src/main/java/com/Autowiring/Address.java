package com.Autowiring;

import org.springframework.beans.factory.annotation.Required;

public class Address {

    private String street;
    private String city;

    public Address(){
        super();
    }

    public Address(String street,String ciyt){
        this.street = street;
        this.city = ciyt;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return city + " " + street ;

    }
}
