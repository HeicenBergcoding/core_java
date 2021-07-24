package com.company.interview07172021;

import java.util.Scanner;

public class CountAndPrintNumberOfVowelsAndConsonants {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.nextLine();

        char ch[] = word.toCharArray();

        int consonantCount=0;
        int vowelCount=0;

        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowelCount+=1;
            }else{
                consonantCount+=1;
            }
        }

        System.out.println("number of vowels " + vowelCount);
        System.out.println("number of consonants " + consonantCount);
    }
}
