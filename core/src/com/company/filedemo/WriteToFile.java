package com.company.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[]args){
        try{

            FileWriter myFile = new FileWriter("demo.txt");
            //writes the content to the specific file

            myFile.write("Java is the prominent language of the milleium");
            //Closing the file

            myFile.close();
            System.out.println("Successfully written");

        }catch (IOException e){
            System.out.println("error occurred");
        }
    }
}
