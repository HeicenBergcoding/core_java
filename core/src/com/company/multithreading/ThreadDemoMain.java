package com.company.multithreading;

public class ThreadDemoMain {
    public static void main(String[] args) {
        //Creating instance of the class that extends Thread Class
        ThreadDemo1 t1 = new ThreadDemo1();
        //calling the start method to execute the run method of thread class
        t1.start();
        //Scheduler calls the run method

    }
}
