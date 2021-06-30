package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(10 + 20 + "Java");
        System.out.println("Java" + 10 + 20);
        String name = null;
        if(null!=name)
            System.out.println(name.length());
        else
            System.out.println("name canot be null");
    }
}
