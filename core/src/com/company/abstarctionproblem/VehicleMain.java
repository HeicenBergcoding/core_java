package com.company.abstarctionproblem;

public class VehicleMain {
    public static void main(String[]args){

        TwoWheeler motorbike = new TwoWheeler();
        FourWheeler car = new FourWheeler();

        double bikeMileage =motorbike.calcMileage("twowheeler");
        double carMileage = car.calcMileage("fourwheeler");

        System.out.println("mileage of bike "+ bikeMileage);
        System.out.println("mileage of car "+ carMileage);

    }
}
