package com.company.collectionsdemo.listdemo;
import java.awt.*;
import java.util.ArrayList;

public class ListDemo1 {
        public static void main(String[] args){
            //Lists allow duplicate values are allowed
            //Lists maintain insertion order
            //Raw List allows to add any data type
            //ArrayLists grow in size as we add more items to it.

            ArrayList numberlist = new ArrayList();
            numberlist.add("Yellow Ball");
            numberlist.add(123);
            numberlist.add("Yellow Ball");
            numberlist.add("Blue Ball");
            numberlist.add("Green Ball");
            numberlist.add("Orange Ball");
            numberlist.add("Black 24");
            numberlist.add(1745.22);

            for (int i=0;i<numberlist.size();i++){
                System.out.println("Color Balls: "+numberlist.get(i));
            }
        }
}
