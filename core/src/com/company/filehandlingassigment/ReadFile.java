package com.company.filehandlingassigment;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[]args){
        try{
            File sameFile = new File("myFile.txt");

            Scanner myReader = new Scanner(sameFile);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (Exception e){
            System.out.println("an error occurred");
        }
    }
}
