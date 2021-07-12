package com.company.collectionsdemo.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemoOne {
    public static void main(String[]args){
        Map<Integer,String> mapOfEmployees = new HashMap<>();
        mapOfEmployees.put(111,"John");//Single Map.entry
        mapOfEmployees.put(555,"Alex");//Single Map.entry
        mapOfEmployees.put(333,"peter");//Single Map.entry
        mapOfEmployees.put(444,"Joe");//Single Map.entry
        mapOfEmployees.put(null,null);//Single Map.entry
        mapOfEmployees.put(null,null);//Single Map.entry

        mapOfEmployees.put(null,null);//If the key n value is exactly same it over rides the whole entry of the
        //map

        mapOfEmployees.put(null,"Ram");//null is allowed in the key as well as value
        mapOfEmployees.put(777,null);//Single Map.entry
        //Map.entry refers to a single element in a whole set of entries{elements}.

        for (Map.Entry<Integer,String> m:mapOfEmployees.entrySet()){    //entry.set is the whole set of Map.entry
            System.out.println(m.getKey()+":"+m.getValue());
            if(m.getValue()!=null && m.getValue().equals("Alex")){
                System.out.println("Found Alex at key :"+m.getKey());
            }
        }
        System.out.println(mapOfEmployees.get(333));
        System.out.println(mapOfEmployees.size());
    }
}
