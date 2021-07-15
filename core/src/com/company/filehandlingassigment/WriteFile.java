package com.company.filehandlingassigment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[]args){
        try{

            FileWriter myFile = new FileWriter("myFile.txt");
            Scanner scanner = new Scanner(System.in);
            String newSen = scanner.nextLine();
            myFile.write(newSen);

            myFile.close();
            System.out.println("Successfully written");

        }catch (IOException e){
            System.out.println("error occurred");
        }
    }
}
