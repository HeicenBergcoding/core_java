package com.company.constructordemo;

public class Shape {

    int length;
    int breadth;
    String shapeType;
    //Default constructors gets called during object creation and its job is to
    //initialise class member variables with default value of the data types
    //ex. default value of int is 0 or string is null.

    public Shape(){
        //Default constructor is a special method which has the same name as the class name
        //it also has a return type but we don't need to specify it.
        System.out.println("default constructor");// in the default constructor the value of parameters are assigned by
        // jvm with their respective default values of data types.
        System.out.println(length);
        System.out.println(breadth);
    }


    public Shape(int length,String shapeType) {
        //the length local parameter is getting assigned to current object's length property.
        //the current object is being pointed by this keyword.
        this.length = length;
        this.shapeType=shapeType;
        System.out.println("two parameterised overloaded constructor");
        System.out.println(this.shapeType);
        System.out.println(this.length);
        System.out.println(breadth);//JVm will initialise the default data type value of breadth.
    }


    public Shape(int length,int breadth,String shapeType){
        this.breadth=breadth;//the length local parameter is getting assigned to current object's length property.
        //the current object is being pointed by this keyword.
        this.length=length;
        this.shapeType=shapeType;
        System.out.println("three parameterised overloaded constructor");
        System.out.println(this.breadth);
        System.out.println(this.length);
        System.out.println(this.shapeType);
        this.test();// calls the current object's test method
    }
    public void test(){
        System.out.println("hello I am test method");
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public String getShapeType() {
        return shapeType;
    }
}
