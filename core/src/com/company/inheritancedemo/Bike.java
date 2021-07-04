package com.company.inheritancedemo;

public class Bike extends Vehicle{

    public Bike(){
        //super(); similar as Vehicle(); if we don't call it JVM automatically calls the constructor of the super class
        System.out.println("default constructor for bike child class");
        super.setVehicleType("bike is two wheeler");
    }

    public void display(){
        System.out.println(super.getVehicleType());
    }
    public void show()// the child class car is overriding the logic of parent class function show
            //this concept is called method overriding - modifying the definition of show inherited from parent class.
     {
        System.out.println("I am a child class constructor");
    }
}
