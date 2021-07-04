package com.company.abstarctionproblem;

public class FourWheeler extends Vehicle{
    @Override
    double calcMileage(String getVehicleType) {
        double mileage=maxMileage;
        boolean isAc=true;
        double weight=500;
        double engineEfficiency=0.85;
        if(getVehicleType.equalsIgnoreCase("four wheeler")){

            if(isAc)
            {
                mileage=mileage*0.6;
            }
            if(weight>300)
            {
                mileage=mileage*0.5;
            }
            mileage=mileage*engineEfficiency;
        }
        return mileage;
    }
}