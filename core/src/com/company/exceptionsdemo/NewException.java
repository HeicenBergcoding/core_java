package com.company.exceptionsdemo;

public class NewException {
    public static void main(String args[]) {
        try {
            int a = 1 / 0;
            System.out.println("a = " + a);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            throw ex;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}