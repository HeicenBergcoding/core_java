package com.company.staticdemo;

public class StaticDemo {

    //static variables
    static int a=10;
    static int b;
    int empId=555;

    public StaticDemo(int empId,int a){
        System.out.println("Default constructor");
        //System.out.println("empId in constructor" + StaticDemo.empId);
        this.empId = empId;
        System.out.println("empId in constructor using this " + this.empId);//doubt
        System.out.println("empId in constructor " + empId);//doubt
        System.out.println("value of a in constructor "+ StaticDemo.a);
        System.out.println("value of a in constructor "+ this.a);
        System.out.println("value of a in constructor "+ a);
        //doubt
    }
    //static block
    static {
        System.out.println("static block initialized");
        System.out.println("b "+ b);
        b=a*4;
    }

    public void show(){
        //
        System.out.println("value of a "+ this.a);
        System.out.println("value of empId "+ this.empId);
    }

    {
        System.out.println("I am a non static block");
    }

    public static void display(){
        //System.out.println("value of a "+ this.a); object creation happens later first the static block gets initialized
        //this cannot be used inside static context, a is not part of object
        //System.out.println("value of empId "+ this.empId);
        System.out.println("value of a inside static block " + a);
        //System.out.println("value of empId inside static block" + empId); //Non-static field 'empId' cannot be referenced from a static context
        //empId is no static so cannot be called before object creation
    }

    public static void main(String[]args){

        System.out.println("From Main");
        System.out.println("value of a is "+ a);
        System.out.println("value of b is " + b);

        StaticDemo st1 = new StaticDemo(666,80);
        StaticDemo st2 = new StaticDemo(888,90);

        st1.empId=777;
        st1.a=30;//class level static variable is updated by st1 obj and this value for static variable will be reflected in every object of that class
        // because every object has same reference to the static variable and it was updated.
        System.out.println("object created st1 a " + st1.a);
        System.out.println("class level variable 'a' accessed via className "+ StaticDemo.a);//static members can be called directly with className
        StaticDemo.display();//static methods can be called directly with className
        System.out.println("object created st1 empID "+ st1.empId);
        System.out.println("object created st2 a "+ st2.a);//30
        System.out.println("object created st2 empID "+ st2.empId);//555


    }
}
