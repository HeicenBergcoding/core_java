package com.company.assigment2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int num1=0;
        int num2=1;
        int n3;
        System.out.print(num1+" "+num2);
        for(int i=2;i<num;i++){
            n3= num1+num2;
            System.out.print(" "+n3);
            num1=num2;
            num2=n3;
        }
    }
}
