package com.company.assigment2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray<targetA> {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int numberOfElements = scanner.nextInt();
        int[] targetArray= new int[numberOfElements];
        for(int i=0;i<targetArray.length;i++){
            System.out.println("enter "+(targetArray.length)+"numbers");
            targetArray[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(targetArray));
        Arrays.sort(targetArray);
        if(targetArray[targetArray.length-1]==targetArray[targetArray.length-2]){
            System.out.println("the second largest element is "+ targetArray[targetArray.length-3]);
        }else{
            System.out.println(targetArray[targetArray.length-1]);
        }
        }

    }

