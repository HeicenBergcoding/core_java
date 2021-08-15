package com.company.todoproblemsandprep;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int checkNumber = scanner.nextInt();
        int checkIf=checkNumber;
        int rev=0;
        int rem=0;

        while(checkNumber!=0){
            rem=checkNumber%10;
            rev=rev*10+rem;
            checkNumber=checkNumber/10;
        }
        System.out.println(checkIf);
        System.out.println(rev);
        if(rev==checkIf){
            System.out.println("it is a palindrome number");
        }else{
            System.out.println("it is not a palindrome");
        }
    }
}
