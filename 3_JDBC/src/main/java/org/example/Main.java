package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        // Step 2 : (after adding mysql-connector ) load drivers
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}