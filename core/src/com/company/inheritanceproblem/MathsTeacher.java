package com.company.inheritanceproblem;

public class MathsTeacher extends Teacher {

    String subject;

    public MathsTeacher(String subject) {
        this.subject = subject;
    }

    public void details() {
        System.out.println("My job is " + profession + " as a " + subject + " in " + schoolName);
    }
}