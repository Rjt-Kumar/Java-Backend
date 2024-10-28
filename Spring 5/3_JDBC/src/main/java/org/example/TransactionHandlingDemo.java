package org.example;
import java.sql.*;

public class TransactionHandlingDemo{
    private static final String url = "jdbc:mysql://localhost:3306/transaction";
    private static final String username = "root";
    private static final String password = "cdrRjt@123";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{

            // Connection Object
            Connection con = DriverManager.getConnection(url,username,password);
            String debitQuery  = "UPDATE accounts SET balance = balance - ? WHERE account_num = ? ";
            String creditQuery  = "UPDATE accounts SET balance = balance + ? WHERE account_num = ? ";


            PreparedStatement debitPrepareStatement = con.prepareStatement(debitQuery);
            PreparedStatement creditPrepareStatement = con.prepareStatement(creditQuery);

            debitPrepareStatement.setDouble(1,500);
            debitPrepareStatement.setInt(2,101);

            creditPrepareStatement.setDouble(1,600);
            creditPrepareStatement.setInt(2,102);
        }catch(SQLException s){
            System.out.printf(s.getMessage());
        }

    }
}