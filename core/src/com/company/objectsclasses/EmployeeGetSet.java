package com.company.objectsclasses;

import com.company.constructordemo.Shape;

import java.util.Date;

public class EmployeeGetSet {
    private long employeeId;
    private double salary;
    private String name;
    private String address;
    private Shape shape;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){this.name=name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address=address;}

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
