package com.company.interview07172021;

public class CountOFPrimes {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[]{12, 13, 7, 6, 8, 9, 11,23,71};
        int count=0;
        int facts=0;
        for(int i=0;i<arrayOfNumbers.length;i++){

            for(int j=2;j<=arrayOfNumbers[i]/2;j++){
                if(arrayOfNumbers[i]%j==0){
                    facts+=1;
                }
            }

            if(facts==0){
                count=count+1;
                System.out.println("prime number "+ arrayOfNumbers[i]);
            }

            facts=0;
        }
        System.out.println("total prime numbers "+ count);
    }
    }


