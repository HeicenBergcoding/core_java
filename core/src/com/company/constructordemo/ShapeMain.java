package com.company.constructordemo;

public class ShapeMain {
    public static void main(String[] args){

        Shape s = new Shape();//calls the default constructor or 0 parameter constructor.
        // this keyword and s reference are pointing to the same object where the object variables
        // length breadth and shapeType are initialised by default values of the constructor by JVM


        Shape s1 = new Shape(20,"Square");
        //this and s1 points to the same object and JVM will initialise only the breadth variable ,
        // length and shapeType parameter are initialised by us.
        s1.test();


        Shape s2 = new Shape(20,10,"rectangle");
        //this and s2 points to the same object and JVM will initialise nothing
        //all the class variables are initialised by us.
        //Example of static polymorphism because decision has bee made at compile time to which overloaded constructor to call
    }
}
