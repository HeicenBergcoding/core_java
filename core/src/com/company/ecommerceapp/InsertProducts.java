package com.company.ecommerceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class InsertProducts {
    public static void main(String[]args){
        String url = "jdbc:mysql://localhost:3306/products";
        String username = "root";
        String password = "";

        Category c1 = new Category(1,"Bags and luggage");
        Category c2 = new Category(2,"electronics");
        Category c3 = new Category(3,"Clothing");
        Category c4 = new Category(4,"Footwear");
        Category c5 = new Category(5,"Bracelets & Bangles");

        ArrayList<Category> categories= new ArrayList<>();
        categories.add(c1);
        categories.add(c2);
        categories.add(c3);
        categories.add(c4);
        categories.add(c5);





        Products p1 = new Products(1,"watch",5000.00,c2.categoryId);
        Products p2 = new Products(2,"smartphone",20000.00,c2.categoryId);
        Products p3 = new Products(3,"refrigerator",30000.00,c2.categoryId);
        Products p4 = new Products(4,"T.V",40000.00,c2.categoryId);
        Products p5 = new Products(5,"jeans",3000.00,c3.categoryId);
        Products p6 = new Products(6,"salwar",7000.00,c3.categoryId);
        Products p7 = new Products(7,"sandals",3000.00,c4.categoryId);
        Products p8 = new Products(8,"slippers",1000.00,c4.categoryId);
        Products p9 = new Products(9,"shoes",6000.00,c4.categoryId);
        Products p10 = new Products(10,"purse",5000.00,c1.categoryId);
        Products p11 = new Products(11,"suitcase",12000.00,c1.categoryId);
        Products p12 = new Products(12,"bangles",1200.00,c5.categoryId);
        Products p13 = new Products(13,"bracelet",800.00,c5.categoryId);

        ArrayList<Products> productsList = new ArrayList<Products>();

        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);
        productsList.add(p4);
        productsList.add(p5);
        productsList.add(p6);
        productsList.add(p7);
        productsList.add(p8);
        productsList.add(p9);
        productsList.add(p10);
        productsList.add(p11);
        productsList.add(p12);
        productsList.add(p13);

        Users u1 = new Users(1,"abhi","abhi@gmail.com","12345678");
        Users u2 = new Users(2,"aman","aman@gmail.com","12345678");
        Users u3 = new Users(3,"risha","risha@gmail.com","12345678");
        Users u4 = new Users(4,"nisha","nisha@gmail.com","12345678");

        ArrayList<Users> userList = new ArrayList<Users>();

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            int rowInserted=0;
            for(int i=0;i<categories.size();i++){
                String sql = "INSERT INTO categories(category_id,category_name) VALUES (?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);


                statement.setInt(1, categories.get(i).categoryId);

                statement.setString(2,categories.get(i).categoryName);

                rowInserted = statement.executeUpdate();

                if(rowInserted>0){
                    System.out.println("Categories inserted");
                }
            }

        }



        catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            int rowInserted=0;
            for(int i=0;i<productsList.size();i++){
                String sql = "INSERT INTO products(product_id,product_name,product_price,category_id) VALUES (?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);


                statement.setInt(1,productsList.get(i).productId );

                statement.setString(2,productsList.get(i).productName);
                statement.setDouble(3,productsList.get(i).productPrice);
                statement.setInt(4,productsList.get(i).categoryId);

                rowInserted = statement.executeUpdate();

                if(rowInserted>0){
                    System.out.println("Products inserted");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            int rowInserted=0;
            for(int i=0;i<userList.size();i++){
                String sql = "INSERT INTO users(user_id,user_name,email,user_password) VALUES (?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);


                statement.setInt(1, userList.get(i).userId);

                statement.setString(2,userList.get(i).userName);
                statement.setString(3,userList.get(i).email);
                statement.setString(4,userList.get(i).password);

                rowInserted = statement.executeUpdate();

                if(rowInserted>0){
                    System.out.println("Users inserted");

                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
