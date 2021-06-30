package com.company.miniprojectauthors;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Student s = new Student();
        System.out.println("enter the student's name");
        s.setName(scanner.nextLine());

        String studentName=s.getName();

        if(studentName.isEmpty()){
            System.out.println("Unknown");
        }
        else{
            System.out.println(studentName);
        }


    }
}
