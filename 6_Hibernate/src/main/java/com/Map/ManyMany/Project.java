package com.Map.ManyMany;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.*;

public class Project {

    @Id
    private int pId;
    private String projectName;

    @ManyToMany
    List<Employe> employes;

    public Project(int pId, String projectName) {
        this.pId = pId;
        this.projectName = projectName;
    }

    public Project(int pId, List<Employe> employes, String projectName) {
        this.pId = pId;
        this.employes = employes;
        this.projectName = projectName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
