package com.company.assigment2;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfEle = scanner.nextInt();
        int[] sumArray = new int[numberOfEle];
        int sum=0;
        for(int i=0;i<numberOfEle;i++){
            sumArray[i]= scanner.nextInt();
        }
        for(int j=0;j<numberOfEle;j++){
            sum=sum+sumArray[j];
        }
        System.out.println(sum);
    }
}
