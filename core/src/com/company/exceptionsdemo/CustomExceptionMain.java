package com.company.exceptionsdemo;

public class CustomExceptionMain {
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            InvalidAgeException ia = new InvalidAgeException("not valid");
            throw ia;
        }else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[]args){
        try {
            validate(20); //if the exception has occurred and the object is thrown already then
            //rest of executable blocks will not run,control will be shifted to the catch blocks
            validate(14);
            validate(25);//this will not get executed.
        }catch (InvalidAgeException m){
            System.out.println("custom exception occurred"+m);
        }catch (Exception e){//Parent exception should always be at the last otherwise compilation error.
            System.out.println("exception occured"+e);
        }
        System.out.println("rest of the code");
    }
}
