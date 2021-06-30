package com.company.objectsclasses.employeeassignment;

import com.company.constructordemo.Shape;
import com.company.objectsclasses.EmployeeGetSet;

import java.util.Scanner;

public class GetEmployeesMain {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int numberOfEmployees = scanner.nextInt();
        EmployeeGetSet e[] = new EmployeeGetSet[numberOfEmployees];
        for(int i=0;i<numberOfEmployees;i++){
            e[i] = new EmployeeGetSet();
            System.out.println("enter an employeeid");
            e[i].setEmployeeId(scanner.nextLong());
            System.out.println("enter a salary");
            e[i].setSalary(scanner.nextDouble());
            System.out.println("enter an name");
            e[i].setName(scanner.next());
            System.out.println("enter an address");
            e[i].setAddress(scanner.next());
            Shape s = new Shape(5, "test");
            e[i].setShape(s);
           // e[i].enterDetails();
        }
        for(int i=0;i<numberOfEmployees;i++){
            System.out.println("employeeId "+ e[i].getEmployeeId());
            System.out.println("Salary "+ e[i].getSalary());
            System.out.println("name "+e[i].getName());
            System.out.println("address "+ e[i].getAddress());
            System.out.println("Shape type "+ e[i].getShape().getShapeType());
            System.out.println("Shape length "+ e[i].getShape().getLength());
        }
    }
}
