package HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Students_For_HQL")
public class Student {

    @Id
    private int id;
    private String name;
    private String address;

    public Student(){
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student( int id,String name, String address) {
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Name : " + this.name + ", ID : " + this.id + ", Address : " + this.address;
    }
}
