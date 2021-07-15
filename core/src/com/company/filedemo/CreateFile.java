package com.company.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[]args){
        try{
            //creating a object of a file
            File obj = new File("demo.txt");
            if(obj.createNewFile()){
                System.out.println("file created:" + obj.getName());
            }else {
                System.out.println("File already exists");
                System.out.println("Path: "+obj.getPath());
                System.out.println("Path: "+obj.getAbsolutePath());
            }
        }
        catch (IOException e){
            System.out.println("an error occurred");
        }
    }
}
