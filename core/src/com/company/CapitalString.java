package com.company;

import java.util.Scanner;

public class CapitalString {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scanner.next();

        // stores each characters to a char array
        char[] characters = sentence.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < characters.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(characters[i])) {

                // check space is present before the letter
                if(foundSpace) {

                    // change the letter into uppercase
                    characters[i] = Character.toUpperCase(characters[i]);
                    foundSpace = false;
                }
            }

            else {
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        sentence = String.valueOf(characters);
        System.out.println("Message: " + sentence);
    }

    public static class CheckPrime {
        public static void main(String[]args){

            int num=23;
            int facts=0;

            for(int i=1;i<=num;i++){
                if(num%i==0){
                    facts=facts+1;
                }
            }
            if(facts<=2){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
