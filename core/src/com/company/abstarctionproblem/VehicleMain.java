package com.company.abstarctionproblem;

public class VehicleMain {
    public static void main(String[]args){

        Vehicle vehicle =  new TwoWheeler();
        double bikeMileage =vehicle.calcMileage();

        vehicle = new FourWheeler(); // Dynamic polymorphism and concept of abstraction
        double carMileage = vehicle.calcMileage();

        vehicle = new ThreeWheeler();//anothe auto implem
        double autoMileage = vehicle.calcMileage();

        System.out.println("mileage of bike "+ bikeMileage);
        System.out.println("mileage of car "+ carMileage);
        System.out.println("mileage of auto "+ autoMileage);

    }
}
