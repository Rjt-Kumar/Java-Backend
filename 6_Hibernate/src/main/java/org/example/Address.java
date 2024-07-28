package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String country;

    public String getCountry() {
        return country;
    }

    public Address(){

    }
    public void setCountry(String country) {
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String b,String c){
        this.city = b;
        this.country = c;
    }
}
