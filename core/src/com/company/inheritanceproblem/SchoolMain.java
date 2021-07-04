package com.company.inheritanceproblem;

public class SchoolMain {
    public static void main(String[] args){
        EngTeacher lina = new EngTeacher();
        lina.teach();

        MathsTeacher sunanda = new MathsTeacher();
        sunanda.teach();

        ChemistryTeacher nupur = new ChemistryTeacher();
        nupur.teach();
    }
}
