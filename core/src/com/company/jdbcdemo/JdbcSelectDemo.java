package com.company.jdbcdemo;
import java.sql.*;

public class JdbcSelectDemo {
    public static void main(String [] args){

        String dbUrl = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl,username,password);

            String sql = "SELECT * FROM users";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            int count=0;

            while (resultSet.next()){//checks if the result query has any data or row or not,if it returns yes it will point to the first row
                //then it will to go to the ext row to check the same
                String name = resultSet.getString(2);
                String pass = resultSet.getString(3);
                String fullName = resultSet.getString("fullname");
                String email = resultSet.getString("email");

                String format = "User #%d: %s - %s - %s -%s";
                String formattedOutput = String.format(format, ++count , name, pass, fullName , email);

                System.out.println(formattedOutput);
        }
        }
        catch (SQLException ex){
                ex.printStackTrace();
            }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
