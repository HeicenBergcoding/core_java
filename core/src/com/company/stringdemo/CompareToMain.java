package com.company.stringdemo;

public class CompareToMain {
    public static void main(String[] args){
        String s1="apple";
        String s2="banana";
        String s3= "cat";
        String s4= "dog";
        String s5= "apple";
        System.out.println(s1.compareTo(s2));//s1-s2 =97-98
        System.out.println(s2.compareTo(s1));//s2-s1 =98-97
        System.out.println(s3.compareTo(s4));//s3-s4 =99-100
        System.out.println(s4.compareTo(s3));//s4-s3 =100-99
        System.out.println(s5.compareTo(s1));//s5-s1 =97-97
    }
}
