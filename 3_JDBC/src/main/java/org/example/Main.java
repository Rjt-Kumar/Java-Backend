package org.example;
import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/dbforjdbc";
    private static final String username = "root";
    private static final String password = "cdrRjt@123";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try{

            // Connection Object

            Connection con = DriverManager.getConnection(url,username,password);
            Statement statement = con.createStatement();
            String query = "select * from students";
            // This will hold the table
            ResultSet result = statement.executeQuery(query);

            while( result.next() ){
                  int id = result.getInt("id");
                  double marks = result.getDouble("marks");
                  String name = result.getString("name");
                  int age = result.getInt("age");

                System.out.println("ID : " + id + ", Name : " + name + ", Marks : " + marks + ", Age : " + age);
            }
        }catch(SQLException s){
            s.printStackTrace();
        }

    }
}

