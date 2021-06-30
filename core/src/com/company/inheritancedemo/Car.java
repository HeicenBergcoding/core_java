package com.company.inheritancedemo;

public class Car extends Vehicle{
    private Long buildNumber;

    public Car(){
        super();
        System.out.println("default constructor for child Car class");
        super.setVehicleType("Car is four wheeler vehicle");
    }

    public Car(long buildNumber){
        this(); //called the default constructor of car class i.e line 5
        this.buildNumber=buildNumber;
    }

    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println("the buildNumber of car is"+ this.buildNumber);
    }

    public void show(){
        System.out.println("I am a child class constructor");
    }
}
