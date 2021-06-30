package com.company;

public class PrimeNumber {
    public static void main(String[] args){
        int primeOrNot = 12;
        int factor=0;
        for(int i=1;i<=primeOrNot;i++){
            if(primeOrNot%i==0){
                factor++;
            }
        }
        System.out.println(factor);
        if(factor>1){
            System.out.print("not prime");
        }else{
            System.out.print("prime");
        }
    }
}
