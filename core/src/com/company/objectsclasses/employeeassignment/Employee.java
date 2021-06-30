package com.company.objectsclasses.employeeassignment;

import java.util.Scanner;

public class Employee {
    long employeeId;
    double salary;

    void enterDetails(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter employeeId for the employee");
        employeeId=scanner.nextLong();
        System.out.println("enter the salary for the employee id");
        salary=scanner.nextDouble();
     }
     void getDetails(){
        System.out.println("the employeeID is "+employeeId);
        System.out.println("the salary for the "+ employeeId + "is "+ salary);
     }
}
