package com.company.exceptionsdemo;

public class FinallyBlockMain {
    public static void main(String[] args){
        try{
            int data=25/5;
            System.out.println(data);
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("finally block is always executed doesnt matter whether exception occurred or not");
            System.out.println("database closing,file closing or any cleaning can be done in finally block ");
        }
        System.out.println("rest of the code");
        try {

        }finally {
            System.out.println("try with finally can exist");
        }
        try {
            System.exit(0);
        }finally {
            System.out.println("finally block wont execute because system.exit was called");
        }
    }
}
