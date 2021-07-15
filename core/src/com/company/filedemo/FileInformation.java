package com.company.filedemo;

import java.io.File;

public class FileInformation {
    public static void main(String[]args){
        File obj = new File("demo.txt");
        if(obj.exists()){

            //returning the file name
            System.out.println("file name: "+ obj.getName());

            //returning the path of the file
            System.out.println("absolute path : "+ obj.getAbsolutePath());

            //displaying the file is writable or not
            System.out.println("Writable: " +obj.canWrite());

            //displaying the file is readable or not
            System.out.println("readable : "+ obj.canRead());

            //returning the length of the file in bytes
            System.out.println("file size: " +obj.length());
        }else{
            System.out.println("file doesn't exist");
        }
    }
}
