package com.company.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[]args){
        try{
            //creating an object of the file for reading the data
            File myFile = new File("demo.txt");

            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
