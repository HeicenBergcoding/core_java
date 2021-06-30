package com.company.polymorphismdemo;

public class Area {
    /*overloaded when
    1.no. of param list differs
    2.sequence of param list differs but data types of params should be same
    3.data type of param list differs*/
    public double calcArea(double radius){
        return (3.14*radius*radius);
    }
    public double calcArea(double length,double breadth){
        return (length*breadth);
    }
    public int calcArea(long side){
        return (int)(side*side);
    }
}
