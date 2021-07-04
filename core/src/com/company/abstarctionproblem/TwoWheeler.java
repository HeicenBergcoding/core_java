package com.company.abstarctionproblem;

public class TwoWheeler extends Vehicle{

    @Override
    double calcMileage(String getVehicleType) {
        double mileage=maxMileage;
        boolean isAc=false;
        double weight=180;
        double engineEfficiency=0.6;
        if(getVehicleType.equalsIgnoreCase("twowheeler")){
            if(isAc){
                mileage=mileage*0.8;

            }
            if(weight>150){
                mileage=mileage*0.9;

            }
            mileage=mileage*engineEfficiency;

        }
        return mileage;
        }
    }

