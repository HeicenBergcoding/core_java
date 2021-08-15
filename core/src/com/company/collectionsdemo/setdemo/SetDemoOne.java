package com.company.collectionsdemo.setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemoOne {
    public static void main(String[]args){
        //Set doesn't maintain order of insertion
        Set<Integer> rolls = new HashSet<>();//allows to add null value
        //Tree implements the sorted set interface
        //Set<Integer> rolls = new TreeSet<>();     //Tree set helps us to sort in ascending order
        //If we add null value then it gives the null pointer exception at runtime
        rolls.add(1);
        rolls.add(5);
        rolls.add(3);
        rolls.add(99);

        rolls.add(null);//Tree set doesn't allow null values will throw null pointer exception but hashset does
        for(Integer r:rolls){
         System.out.println(r);
        }
        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);
        System.out.println(rolls.size());   //size remains same as duplicates are over ridden
        rolls.remove(99);
        System.out.println(rolls.size());
        rolls.clear();                      // clears the whole set
        System.out.println(rolls.size());
    }
}
