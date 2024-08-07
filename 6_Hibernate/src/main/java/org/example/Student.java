package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    public Student(String name, Address address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    @Id
    private int id;
    private String name;
    @OneToMany
    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(int id,String name){
      this.id = id;
      this.name = name;
    }
    public String toString(){
       return this.address + " " + this.id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
