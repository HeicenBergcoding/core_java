package com.company.abstractdemo;

public class ContractEmployee extends Employee {

    @Override
    public double calculateSalary(String employmentType) {
        double tax = 0.30;
        double grossSalary = 80000;
        double netSalary = 0.0;
        if(employmentType.equalsIgnoreCase("contract")){
            double deduction = 5000;
            grossSalary = grossSalary-(grossSalary*tax)-deduction;
            netSalary = grossSalary;
        }
        return netSalary;
    }
}
