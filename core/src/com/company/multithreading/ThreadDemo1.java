package com.company.multithreading;

public class ThreadDemo1 extends Thread{
        public void run(){
            int a=10;
            int b=12;
            int output=a+b;
            System.out.println("Thread started running");
            System.out.println("sum is"+ output);
        }
    }
































































