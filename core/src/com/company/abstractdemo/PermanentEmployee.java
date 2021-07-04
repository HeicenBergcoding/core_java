package com.company.abstractdemo;

//this class must be declared as abstract or provide method body to all abstract methods in abstract class
public class PermanentEmployee extends Employee{
    @Override
    public double calculateSalary(String empType) {
        double tax=0.20;
        double grossSalary=60000;
        double netSalary = 0.0;
        if(empType.equalsIgnoreCase("permanent")){
            netSalary = grossSalary*tax;
            netSalary = netSalary+10000;//10000 is bonus for permanent employee
        }
        return netSalary;
    }
}
