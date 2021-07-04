package com.company.abstractdemo;

public class AbstractMain {
    public static void main(String[] args) {
        //Employee e1 = new Employee();//object instantiation or creation is not allowed for an abstract class.

        PermanentEmployee e1 = new PermanentEmployee();
        String companyName = e1.getCompanyName();
        double salary = e1.calculateSalary("permanent");
        System.out.println("company name "+ companyName);
        System.out.println("salary"+ salary);

        ContractEmployee e2 = new ContractEmployee();
        String cmpName = e2.getCompanyName();
        double contractSalary =e2.calculateSalary("contract");
        System.out.println("company name "+cmpName);
        System.out.println("salary "+ contractSalary);
    }
}
