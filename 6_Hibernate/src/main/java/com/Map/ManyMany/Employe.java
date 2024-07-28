package com.Map.ManyMany;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.*;

public class Employe {

    @Id
    private int empId;
    private String name;


    @ManyToMany
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
