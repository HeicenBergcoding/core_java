package com.company.todoproblemsandprep;

import java.util.Scanner;

public class StrongNumber {//strong number is the one whose sum of factorial of its numbers is same as the number
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial=1;
        int totalFactorial=0;

        int rem=0;
        while(number!=0){
            rem=number%10;
            for(int i=rem;i>=1;i--){
                factorial=factorial*i;
            }
            number=number/10;
            totalFactorial=factorial;
        }

    }
}
