package com.company.polymorphismdemo;

public class AreaMain {
    public static void main(String []args){
        Area a = new Area();
        double area = a.calcArea(3);
        System.out.println("area of circle "+area);
        System.out.println("area of rectangle "+ a.calcArea(3,4));
        System.out.println("area of square "+ a.calcArea(4));

    }
}
