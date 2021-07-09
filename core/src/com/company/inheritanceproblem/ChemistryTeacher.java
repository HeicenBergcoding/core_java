package com.company.inheritanceproblem;

public class ChemistryTeacher extends Teacher {

    String subject;

    public ChemistryTeacher(String subject){
        this.subject = subject;
    }
    public void details(){
        System.out.println("My job is "+profession+" as a "+subject+" in "+schoolName);
    }
}
