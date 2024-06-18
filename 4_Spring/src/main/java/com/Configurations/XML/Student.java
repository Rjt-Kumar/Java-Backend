package com.Configurations.XML;
import java.util.*;
public class Student {

        private String name;
        private String UID;
        private int marks;
        private  HashMap<String,Integer> map;
        private HashSet<Integer> set;

    public HashMap<String, Integer> getMap() {
        return map;
    }
    @Override
    public String toString(){
        return name + " " + UID + " " + marks;
    }
    public void setMap(HashMap<String, Integer> map) {
        this.map = map;
    }

    public HashSet<Integer> getSet() {
        return set;
    }

    public void setSet(HashSet<Integer> set) {
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUID(String uid){
        this.UID = uid;
    }

    public String getUID(){
        return this.UID;
    }
}
