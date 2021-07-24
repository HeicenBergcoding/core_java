package com.company.interview07172021;

import java.util.Arrays;

public class SelectionSortDescendingOrder {
    public static void main(String[]args){

        int arr[] = new int[]{45,87,23,54,1};
        int size = arr.length;


        for(int i=0;i<=size-1;i++){
            int max=i;
            for(int j=i+1;j<=size-1;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        }


}



