package com.company.assigment2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortEmployees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int numberOfEmployees = scanner.nextInt();
        int[] arrayOfEmployeeIDs = new int[numberOfEmployees];
        System.out.println("enter employee IDs");
        for (int i = 0; i < numberOfEmployees; i++) {
            arrayOfEmployeeIDs[i] = scanner.nextInt();
        }
        System.out.println("employeeIDs are " + Arrays.toString(arrayOfEmployeeIDs));
        int temp = 0;
        for (int i = 0; i < numberOfEmployees - 2; i++) {
            for (int j = 0; j < numberOfEmployees - i - 1; j++) {
                if (arrayOfEmployeeIDs[j] > arrayOfEmployeeIDs[j + 1]) {
                    temp = arrayOfEmployeeIDs[j];
                    arrayOfEmployeeIDs[j] = arrayOfEmployeeIDs[j + 1];
                    arrayOfEmployeeIDs[j + 1] = temp;
                }
            }
        }
        System.out.println("Employee IDs after sorting =" + Arrays.toString(arrayOfEmployeeIDs));
    }
}
