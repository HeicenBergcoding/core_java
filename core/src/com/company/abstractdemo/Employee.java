package com.company.abstractdemo;

abstract public class Employee {

    private final String companyName = "xyz private limited";

    public String getCompanyName(){//concrete method-it has its own body and implementation
        return this.companyName;
    }

    public abstract double calculateSalary(String employmentType);

}
