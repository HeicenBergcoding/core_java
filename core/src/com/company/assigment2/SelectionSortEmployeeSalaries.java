package com.company.assigment2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortEmployeeSalaries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int numberOfEmployees = scanner.nextInt();
        int[] arrayOfSalaries = new int[numberOfEmployees];
        System.out.println("enter the salaries of employees");
        for(int i=0;i<numberOfEmployees;i++){
            arrayOfSalaries[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayOfSalaries));
        int temp_min;
        for(int i=0;i<numberOfEmployees;i++){
            for(int j=i+1;j<numberOfEmployees;j++){
               temp_min=arrayOfSalaries[i];
               if(temp_min>arrayOfSalaries[j]){
                   arrayOfSalaries[i]=arrayOfSalaries[j];
                   arrayOfSalaries[j]=temp_min;
               }
            }
        }
        System.out.println("the sorted array"+ Arrays.toString(arrayOfSalaries));
    }
}
