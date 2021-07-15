package com.company.serilizationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain {
    public static void main(String[]args){
        Product product = null;
        String fileName = "product2.txt";
        //Deserialization

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            //method for deserialization of object
            product = (Product) in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("productID "+ product.getProductId());
            System.out.println("productName"+product.getProductName() );
            System.out.println("productPrice "+ product.getProductPrice());
        }catch (IOException | ClassNotFoundException e){
            System.out.println("no errors occurred");
        }
    }
}
