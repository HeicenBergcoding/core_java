package com.company.collectionsdemo.collectionsassignment;

public class Employee {
    String empName;
    Double salary;
    Long empId;

    Employee(String empName,Double salary){
        this.empName=empName;
        this.salary=salary;
    }

    Employee(Long empId){
        this.empId=empId;
    }

}
