package com.company.interview07172021;

public class SmallestAndLargest {
    public static void main(String[]args){
        int arrayOfNumbers[] = new int[]{10,5,1,3,7,54,32};

        int small=arrayOfNumbers[0];
        int large=arrayOfNumbers[0];

        for(int i=0;i<arrayOfNumbers.length;i++){
            if(small>arrayOfNumbers[i]){
                small=arrayOfNumbers[i];
            }
            if(large<arrayOfNumbers[i]){
                large=arrayOfNumbers[i];
            }
        }
        System.out.println("smallest number is "+ small);
        System.out.println("largest number is "+large);
    }
}
