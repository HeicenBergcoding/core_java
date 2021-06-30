package com.company;

public class PalidromeString {
    public static void main(String[] args) {
        String name = "radar";
        String rev = "";
        int str_length = name.length();
        for (int i = str_length - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)) {
            System.out.println("palindrome string");
        }else{
            System.out.println("not a palindrome string");
        }
    }
}

