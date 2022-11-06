package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
        String userName = "root";
        String passWord = "Aniket@26";

        //Driver Loading
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Class Found ");
        } catch (Exception e) {
            System.out.println("Driver Class not Found " + e);
        }

        // Connecting With Database
        try {
            System.out.println("Connecting to database: " + jdbcURL);
            Connection connection =  DriverManager.getConnection(jdbcURL, userName, passWord);
            System.out.println("Connection is successful!!!!! " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" ");
    }
}