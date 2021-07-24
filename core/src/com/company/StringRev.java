package com.company;

public class StringRev {
    public static void main(String[]args){
        String input = "goggles";
        StringBuilder rev = new StringBuilder();

        char[] ch = input.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println(rev);
    }
}
