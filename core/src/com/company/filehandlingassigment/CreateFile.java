package com.company.filehandlingassigment;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String [] args){
        File myFile = new File("myFile.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("file created:" +myFile.getName());
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}