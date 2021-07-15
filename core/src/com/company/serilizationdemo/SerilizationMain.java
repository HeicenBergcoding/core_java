package com.company.serilizationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationMain {
    public static void main(String[]args){

        Product product = new Product(22,"shampoo",100.00);
        Product product2 = new Product(24,"shampoo",1000.00);
        String fileName = "product2.txt";

        //Serialization

        try{

            //saving of object
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //Method to serialize the object
            out.writeObject(product2);
            out.close();
            file.close();

            System.out.println("object has been serialized");

        }catch (FileNotFoundException fnf){
            System.out.println("file not found");
        }catch (IOException e){
            System.out.println("ana error occurred");
        }
    }
}
