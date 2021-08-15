package com.company.abstarctionproblem;

public class TwoWheeler extends Vehicle{

    @Override
    double calcMileage() {
        double mileage=maxMileage*0.6;
        return mileage;
    }
}

