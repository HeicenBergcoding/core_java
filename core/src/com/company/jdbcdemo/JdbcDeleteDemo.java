package com.company.jdbcdemo;

import java.sql.*;

public class JdbcDeleteDemo {
    public static void main(String[]args){

        String dbUrl = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl,username,password);
            String sql = "DELETE FROM users WHERE username = ? ";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"abhi");

            int rowDeleted = statement.executeUpdate();

            if(rowDeleted>0){
                System.out.println("A user was deleted successfully");
            }else{
                System.out.println("user not found");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
