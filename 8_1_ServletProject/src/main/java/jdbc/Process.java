
package jdbc;
import entities.Message;

import java.io.PrintWriter;
import java.security.MessageDigest;
import java.sql.*;

public class Process {

    private static final String url = "jdbc:mysql://localhost:3306/feedback"  ;
    private static final String pass = "cdrRjt@123";
    private static final String username = "root";

    private static  Connection con;

    public Process(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        con =  DriverManager.getConnection(url,username,pass );}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }

    public static void insert(Message mess) throws Exception{

        String query = "Insert into jdbc(email,phone,message) VALUE(?,?,?)";

        PreparedStatement statement  = con.prepareStatement(query);
        statement.setString(1,mess.getEmail());
        statement.setString(2,mess.getPhone());
        statement.setString(3,mess.getMessage());

        System.out.println("Insert Completed : " + statement.execute());

    }

    public static void show(PrintWriter writer) throws Exception{

        String query = "Select *from jdbc;";
        PreparedStatement statement  = con.prepareStatement(query);

        ResultSet result = statement.executeQuery(query);
        while( result.next() ){
            String email  = result.getString("email");
            String phone = result.getString("phone");
            String mess = result.getString("message");

            writer.println("<h3>Email : %s</h3> <br>".formatted(email));
            writer.println("<h3>Phone Number : %s</h3> <br>".formatted(phone));
            writer.println("<h3>Feeback Message : %s</h3> <br>".formatted(mess));
            writer.println("<br>");
        }

    }
}
