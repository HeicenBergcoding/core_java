package com.company.todoproblemsandprep;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int ifArmstrong = scanner.nextInt();
        int checkArmstrong = ifArmstrong;
        int rem = 0;
        int temp= 0;

        while (ifArmstrong!=0){
            rem=ifArmstrong%10;
            temp=  temp+(int)Math.pow(rem,3);
            ifArmstrong=ifArmstrong/10;
        }
        System.out.println(checkArmstrong);
        System.out.println(temp);
        if(checkArmstrong==temp){
            System.out.println("it is armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
