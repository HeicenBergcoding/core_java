package com.company.inheritanceproblem;

public class EngTeacher extends School{
    public EngTeacher(){
        super.setSub2("English");
    }
    public void teach(){
        System.out.println("I teach "+ super.getSub2());
    }
}
