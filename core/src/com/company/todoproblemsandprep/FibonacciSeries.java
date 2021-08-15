package com.company.todoproblemsandprep;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1+ " " +n2);
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        for(int i=2;i<range;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
