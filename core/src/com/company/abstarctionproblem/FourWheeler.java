package com.company.abstarctionproblem;

public class FourWheeler extends Vehicle{
    @Override
    double calcMileage() {
        double mileage=maxMileage*0.4;
        return mileage;
    }
}