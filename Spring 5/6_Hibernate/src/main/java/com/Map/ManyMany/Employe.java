package com.Map.ManyMany;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Employe {

    @Id
    private int empId;
    private String name;


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @ManyToMany()
    @JoinTable(
            name = "emp_pro",
            joinColumns = @JoinColumn(name = "Project_ID"),
            inverseJoinColumns = @JoinColumn(name = "Employr_ID")
    )
    List<Project> projects;

    public Employe(int empId, List<Project> projects, String name) {
        this.empId = empId;
        this.projects = projects;
        this.name = name;
    }

    public Employe(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
