package com.company.collectionsdemo.collectionsassignment;

import java.util.*;

public class EmpMain {
    public static void main(String[]args){

        Employee e1 = new Employee("abhi",10000.00);
        Employee e2 = new Employee("raj",15000.00);
        Employee e3 = new Employee("manish",12000.00);
        Employee e4 = new Employee("aman",17000.00);
        Employee e5 = new Employee("shiv",14000.00);
        Employee e6 = new Employee("sonya",16000.00);
        Employee e7 = new Employee("ritu",10000.80);
        Employee e8 = new Employee("suraj",9000.00);
        Employee e9 = new Employee("yasmin",25000.00);
        Employee e0 = new Employee("zareen",20000.00);

        List<Employee> empList = new ArrayList<>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e0);

        //filtering salaries greater than 15000
        System.out.println("---------------------------");
        System.out.println("salaries greater than 15000");
        System.out.println("---------------------------");
        for (Employee e: empList){
            if(e.salary>15000){
                System.out.println(e.empName+" "+e.salary);
            }
        }

        //Descending order list names

        System.out.println("---------------------------");
        System.out.println("list of employee names in descending order");
        String tempString;

        for(int i=0;i<empList.size();i++){
            for(int j=i+1;j<empList.size();j++){
            int stringVal=empList.get(i).empName.compareTo(empList.get(j).empName);
            if(stringVal<1) {
                tempString=empList.get(i).empName;
                empList.get(i).empName=empList.get(j).empName;
                empList.get(j).empName=tempString;
            }
            }
        }
        System.out.println("---------------------------");
        for(int i=0;i<empList.size();i++){
            System.out.println(empList.get(i).empName );
        }

        //Ascending order salaries of Employeees

        System.out.println("---------------------------");
        System.out.println("list of employee salaries in ascending order");
        System.out.println("---------------------------");

        for(int i=0;i<empList.size();i++){
            for(int j=i+1;j<empList.size();j++){
                double tempSalary;
                if(empList.get(i).salary>empList.get(j).salary) {
                    tempSalary=empList.get(i).salary;
                    empList.get(i).salary=empList.get(j).salary;
                    empList.get(j).salary=tempSalary;
                }
            }
        }

        for(int i=0;i<empList.size();i++){
            System.out.println(empList.get(i).salary );
        }

        //Creating 5 unique employees in hashset using Ids
        //ask the doubt about constructor usage

        System.out.println("---------------------------");

        Employee e11 = new Employee(120l);
        Employee e12 = new Employee(121l);
        Employee e13 = new Employee(122l);
        Employee e14 = new Employee(123l);
        Employee e15 = new Employee(124l);

        Set <Employee> empSet = new HashSet<>();

        empSet.add(e11);
        empSet.add(e12);
        empSet.add(e13);
        empSet.add(e14);
        empSet.add(e15);

        System.out.println("size before adding duplicate employees "+ empSet.size());

        System.out.println("---------------------------");

        //Creating 3 duplicate employees in hashset using Ids

        empSet.add(e11);
        empSet.add(e12);
        empSet.add(e13);

        System.out.println("size after adding duplicate employees "+ empSet.size());


        System.out.println("---------------------------");
        //creating a map of 10 employees with ids as keys and objects as values

        System.out.println("A map of employees ids as keys and objects as values");
        System.out.println("---------------------------");
        Map<Long,Employee> empMap = new HashMap<>();

        empMap.put(e11.empId,e1);
        empMap.put(e12.empId,e2);
        empMap.put(e13.empId,e3);
        empMap.put(e14.empId,e4);
        empMap.put(e15.empId,e5);

        for(Map.Entry<Long,Employee> e: empMap.entrySet()){
            System.out.println(e.getKey()+ "->"+ e.getValue());
        }
    }
}
