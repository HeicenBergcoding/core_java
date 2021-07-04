package com.company.inheritanceproblem;

public class ChemistryTeacher extends School {
    public ChemistryTeacher(){
        super.setSub3("chemistry");
    }
    public void teach(){
        System.out.println("I teach "+ super.getSub3());
    }
}
