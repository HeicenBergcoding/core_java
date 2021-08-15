package com.company.jdbcdemo;
import java.sql.*;

//database Drivers - It is a  set of classes through which we interact with different types of databases.
public class JdbcInsertDemo {
    public static void main(String[]args){
        String dbUrl = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");//creates a driver object for interacting with mysql database,
            // different databases have different types of driver ex-oracle,mysql.
            Connection conn = DriverManager.getConnection(dbUrl,username,password); //creates a connection
            // to mysql database server by taking dburl,username,password parameters.

            String sql = "INSERT INTO users(username,user_password,fullname,email) VALUES (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"abhi");
            statement.setString(2,"abhipass");
            statement.setString(3,"abhi Mishra");
            statement.setString(4,"abhi.mishra@gmail.com");

            int rowInserted = statement.executeUpdate();//for executing the queries it returns the number of affected rows.

            if(rowInserted>0){
                System.out.println("A new user was inserted successfully");
            }
        }

        catch (SQLException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
