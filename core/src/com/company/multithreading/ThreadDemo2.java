package com.company.multithreading;

public class ThreadDemo2 implements Runnable{
    String name;
    Thread thread;

    ThreadDemo2(String name){
        this.name=name;
        thread = new Thread(this,name);
        System.out.println("New Thread: "+ thread+ "is created" );
        thread.start();
    }
    @Override
    public void run() {
    try{
        for (int j = 5;j>=0;j--){
            System.out.println(name+" :"+ j);
            Thread.sleep(1000);
        }

    }catch (InterruptedException e){
        System.out.println(name+"thread interrupted");
    }
    System.out.println(name+ "thread exiting");
    }
}
