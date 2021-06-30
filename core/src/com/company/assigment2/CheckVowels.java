package com.company.assigment2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of char array");
        int numberOfChars = scanner.nextInt();
        System.out.println("enter array of characters ");
        char[] arrayOfCharacters = new char[numberOfChars];
        for (int i = 0; i < numberOfChars; i++) {
            arrayOfCharacters[i] = scanner.next().charAt(0);
        }
        System.out.println("the array is" + Arrays.toString(arrayOfCharacters));
        for (int i = 0; i < numberOfChars; i++) {
            if (arrayOfCharacters[i] == 'a' || arrayOfCharacters[i] == 'e' || arrayOfCharacters[i] == 'i' || arrayOfCharacters[i] == 'o' || arrayOfCharacters[i] == 'u') {
                System.out.println("vowel found "+ arrayOfCharacters[i]);
                break;
            }else{
                System.out.println("vowel not found");
                break;
            }
            }
        }
    }
