package entities;

import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Entity
@Table(name="student_details")
public class Student {

    @Id
    @javax.persistence.Column(name="student_id")
    private int id;

    @javax.persistence.Column(name="student_name")
    private String name;

    @javax.persistence.Column(name="student_city")
    private String city;

    public int getId() {
        return id;
    }

    public Student(){
        super();
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}
