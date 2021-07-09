package com.company.inheritanceproblem;

public class EngTeacher extends Teacher{

    String subject;

    public EngTeacher(String subject){
        this.subject = subject;
    }
    public void details(){
        System.out.println("My job is "+profession+" as a "+subject+" in "+schoolName);
    }
}
