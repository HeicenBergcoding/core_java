package com.company.todoproblemsandprep;

import java.util.Scanner;

public class ArmstrongInARange {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first limit");
        int firstLimit = scanner.nextInt();

        System.out.println("enter the last limit");
        int lastLimit = scanner.nextInt();

        for(int i=firstLimit;i<=lastLimit;i++){
            System.out.println("for loop");
            int lastNum=0;
            int temp=0;

            while (i!=0){
                System.out.println("while loop");
                lastNum=i%10;
                temp = (int) (temp+Math.pow(lastNum,3));//casting doubt
                i=i/10;
            }
            if(i==temp){
                System.out.println(i+" is an armstrong number");
            }else{
                System.out.println("no armastrog found");
            }
        }
    }
}
