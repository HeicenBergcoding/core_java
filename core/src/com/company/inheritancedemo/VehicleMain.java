package com.company.inheritancedemo;

public class VehicleMain {
    public static void main(String []args){
            Bike bike = new Bike();
            bike.display();

            Car car = new Car(456654);
            car.display();

            System.out.println("----------------------------------------------");
            // the concept of making decision to which obejects method should be called at run time
            //is called dynamic polymorphism
            //whose object that particular method gets called
            Vehicle vehicle = new Vehicle();
            vehicle.show();

            vehicle=new Bike();
            bike.show();

            vehicle= new Car();
            car.show();

    }
}