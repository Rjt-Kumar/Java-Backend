package org.example;
<<<<<<< HEAD
import java.sql.*;
=======
import javax.xml.stream.events.StartElement;
import java.sql.*;
import java.util.Arrays;
>>>>>>> origin/main

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/dbforjdbc";
    private static final String username = "root";
    private static final String password = "cdrRjt@123";
    public static void main(String[] args) {
<<<<<<< HEAD

        // Step 2 : (after adding mysql-connector ) load drivers
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

=======
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{

            // Connection Object

            Connection con = DriverManager.getConnection(url,username,password);
            Statement statement = con.createStatement();
//            String query = String.format("DELETE from students where id = %o OR %o",3,4);
//
//            // This will hold the table
//            int rowAffected = statement.executeUpdate(query);
//
//            if( rowAffected > 0 ) System.out.println("Successfully Updated");

            printTable(con,statement);
            multiStatement(con);


        }catch(SQLException s){
            System.out.println(s.getMessage());
        }
>>>>>>> origin/main

    }

    public static void printTable(Connection con, Statement statement) throws SQLException{
        ResultSet result = statement.executeQuery("SELECT * from students");

        while( result.next() ){
            int id = result.getInt("id");
            double marks = result.getDouble("marks");
            String name = result.getString("name");
            int age = result.getInt("age");

            System.out.println("ID : " + id + ", Name : " + name + ", Marks : " + marks + ", Age : " + age);
        }
    }

    // USing a single Prepared Statement to run multiple queries
    public static  void multiStatement(Connection con) throws SQLException{

         String query = "INSERT INTO students(name,age,marks) VALUE(?,?,?)";
         PreparedStatement preparedStatement = con.prepareStatement(query);

         // Adding To batch
         preparedStatement.setString(1,"Rahul");
         preparedStatement.setInt(2,23);
         preparedStatement.setDouble(3,96.6);
         preparedStatement.addBatch();

         //Now using the same preparedStatement and adding it to the batch
        preparedStatement.setString(1,"Rajat");
        preparedStatement.setInt(2,20);
        preparedStatement.setDouble(3,94.6);
        preparedStatement.addBatch();

        preparedStatement.setString(1,"Dwivedi");
        preparedStatement.setInt(2,20);
        preparedStatement.setDouble(3,75.5);
        preparedStatement.addBatch();

        int[] rowsAffected  = preparedStatement.executeBatch();

        System.out.printf(Arrays.toString(rowsAffected));
    }

}

