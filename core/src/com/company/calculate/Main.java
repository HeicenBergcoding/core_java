package com.company.calculate;

public class Main
{
    public static void main(String[] args)
    {//test
        int result = new Calculate()
        {
            @Override
            int multiply(int a, int b)
            {
                return a*b;
            }
        }.multiply(12,32);
        System.out.println("result = "+result);
    }
}
