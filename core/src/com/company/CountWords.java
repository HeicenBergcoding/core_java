package com.company;

import java.util.Scanner;

public class CountWords {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a sentence");
        String sentence = scanner.nextLine();

        if(sentence==null||sentence.isEmpty()){
            System.out.println("no words present");
            System.exit(0);
        }

        int count = 0;
        boolean isAWord= false;
        int endline = sentence.length()-1;
        char[] characters = sentence.toCharArray();

        for(int i=0;i< characters.length;i++){

            if(Character.isLetter(characters[i]) && i!=endline){
                isAWord=true;
            }

            else if(!Character.isLetter(characters[i])&&isAWord){
                count++;
                isAWord=false;

            }
            else if(Character.isLetter(characters[i])&& i==endline){
                count++;

            }
        }
        System.out.println(count);
    }
}
