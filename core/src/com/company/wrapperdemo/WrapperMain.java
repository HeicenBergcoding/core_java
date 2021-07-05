package com.company.wrapperdemo;

public class WrapperMain {
    public static void main(String[]args){
        //Example of wrapper classes
        Integer num=10;
        Integer num2 = new Integer(12345);

        Double salary = 2345.23;
        Double salary2 = new Double(2341.25);

        Float a =234.25f;

        Long ln =2123l;

        Character c = 'A';

        Boolean b = new Boolean(true);

        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);


        int x = 55;
        Integer y = x;//autoboxing
        System.out.println(x);
        System.out.println(y);

        Double d1 = 234.5;
        double d2 = d1;//Unboxing
        System.out.println(d1);
        System.out.println(d2);
    }
}
