package com.company.arraydemo;

import java.util.Scanner;

public class EmployeeIDProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);*/
        System.out.println("hi,please enter the number of employees you have");
        int numberOFEmployees= scanner.nextInt();
        int[] arrayOfEmployees = new int[numberOFEmployees];

        for(int i=0;i<arrayOfEmployees.length;i++){
            System.out.println("enter the id of "+(i+1)+" employee");
            arrayOfEmployees[i]=scanner.nextInt();
        }

        for(int i=0;i < arrayOfEmployees.length;i++){
            System.out.println("The id of employee "+(i+1)+" is "+arrayOfEmployees[i]);
        }
    }
}