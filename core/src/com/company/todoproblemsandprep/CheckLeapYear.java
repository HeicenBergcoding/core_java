package com.company.todoproblemsandprep;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year");
        int year = scanner.nextInt();

        if((year% 4==0&& year%100!=0)||year%400==0){
            System.out.println("it is a leap year");
        }else{
            System.out.println("not a leap year");
        }
  }
}
