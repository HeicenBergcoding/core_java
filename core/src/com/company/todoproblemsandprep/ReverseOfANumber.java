package com.company.todoproblemsandprep;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();

        int rev = 0;
        int rem;

        while (number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }

        System.out.println(rev);
    }
}
