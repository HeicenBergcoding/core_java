package com.company.inheritanceproblem;

public class SchoolMain {
    public static void main(String[] args){
        EngTeacher lina = new EngTeacher("Ënglish");
        lina.details();

        MathsTeacher sunanda = new MathsTeacher("Maths");
        sunanda.details();

        ChemistryTeacher nupur = new ChemistryTeacher("chemistry");
        nupur.details();
    }
}
