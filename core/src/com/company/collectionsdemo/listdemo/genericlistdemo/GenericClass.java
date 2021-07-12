package com.company.collectionsdemo.listdemo.genericlistdemo;

import java.util.ArrayList;

public class GenericClass {
    public static void main(String[]args){
        ArrayList<Integer> empIdList = new ArrayList<>();
        ArrayList<String> empNameList = new ArrayList<>();

        empIdList.add(123);
        //empIdList.add("ram");generic enforces strict data type constraints on the list here it is integer so
        //it would not allow string data type
        empNameList.add("Ram");
        //empNameList.add(234);generic enforces strict data type constraints on the list here it is String so
        //it would not allow integer data type

    }
}
