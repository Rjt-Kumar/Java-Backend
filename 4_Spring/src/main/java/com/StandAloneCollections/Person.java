package com.StandAloneCollections;
import java.util.*;
public class Person {

      private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {

        return list.toString();
    }
}
