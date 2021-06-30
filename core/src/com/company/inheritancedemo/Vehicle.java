package com.company.inheritancedemo;

public class Vehicle {

    public Vehicle(){
        System.out.println("default constructor for vehicle super class");
    }
    private String vehicleType;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void show(){
        System.out.println("I am a parent class vehicle");
    }
}
