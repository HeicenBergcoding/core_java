package com.company.arraydemo;

public class EmployeesID {
    public static void main(String[] args){
        boolean isEmployee[] = new boolean[5];
        isEmployee[3]=true;
        for(int i = 0; i< isEmployee.length; i++){
            System.out.println(isEmployee[i]);
        }    }
}
