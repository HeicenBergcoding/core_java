package com.company.objectsclasses;

public class EmployeeMain {
    public static void main(String[] args){
        EmployeeGetSet e1 = new EmployeeGetSet();
        e1.setEmployeeId(111l);
        e1.setSalary(15000);

        EmployeeGetSet e2 = new EmployeeGetSet();
        e2.setEmployeeId(123l);
        e2.setSalary(160000);

        System.out.println("employee details for e1 is"+ e1.getEmployeeId());
        System.out.println("employee details for e1 is"+ e2.getEmployeeId());
    }
}
