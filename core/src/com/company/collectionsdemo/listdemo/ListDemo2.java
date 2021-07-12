package com.company.collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[]args){
        List<String> fruitsLists = new ArrayList<>();
        fruitsLists.add("Mango");
        fruitsLists.add("Apple");
        fruitsLists.add("Papaya");
        fruitsLists.add(null); //allows to add null values

        System.out.println(fruitsLists.get(1));// gets the list item at index 1
        fruitsLists.add(1,"Grapes"); //Adds new elements grapes at index 1
        System.out.println(fruitsLists.get(2));
        System.out.println(fruitsLists.size());
        fruitsLists.remove("Apple");//removes the element apple
        fruitsLists.set(2,"Orange");//replace element at index 2 with orange

        for (String a: fruitsLists){
            System.out.println(a);
        }
        if(fruitsLists.contains("Mango")){
            System.out.println("its present");
        }else {
            System.out.println("its not present");
        }
        if(fruitsLists.isEmpty()){
            System.out.println("its empty");
        }else {
            System.out.println("list is not empty");
        }
        fruitsLists = new LinkedList<>();
    }
}
