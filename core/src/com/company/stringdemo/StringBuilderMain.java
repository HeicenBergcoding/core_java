package com.company.stringdemo;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args){
        //Whenever we want to do string manipulation use String Builder instead of String for better performance
        StringBuilder sb = new StringBuilder("abolish");
        String name= sb.toString();
        System.out.println(sb);
        sb.append(" mishra");
        System.out.println(sb);
        sb.insert(7," kumar");
        System.out.println(sb);
        System.out.println(sb.delete(8,13));
        System.out.println(sb.reverse());
        System.out.println(sb);
    }
}
