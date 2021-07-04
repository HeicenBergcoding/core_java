package com.company.inheritanceproblem;

public class MathsTeacher extends School{
    public MathsTeacher(){
        super.setSub1("Maths");
    }
    public void teach(){
        System.out.println("I teach "+ super.getSub1());
    }
}
