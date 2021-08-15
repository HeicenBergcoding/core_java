package com.company.todoproblemsandprep;

public class SumOfDigitsOfANumber {
    public static void main(String[]args){
        int number=5142;
        int rem=0;
        int sum=0;

        while (number!=0){
            rem=number%10;
            sum=rem+sum;
            number=number/10;
        }


        System.out.println(sum);
    }
}
