package com.company.interview07172021;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class FirstAndLastOfEveryWordCapital {
    //this is my house ThiS IS MY HousE

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scanner.nextLine();

        char ch[] = sentence.toCharArray();

        int size = ch.length;

        int end = ch.length-1;



        for(int i=0;i<size;i++) {

            //for capitalizing the first character
            if (i == 0 && ch[0]!=' ') {
                ch[i] = Character.toUpperCase(ch[0]);
            }

            //for capitalizing the end of every word
            if(i!=end && ch[i+1]==' ' && Character.isLetter(ch[i-1])){
                ch[i]=Character.toUpperCase(ch[i]);
            }

            //for capitalizing the first letter of every word
            if(i!=0 && ch[i-1]==' ' && Character.isLetter(ch[i+1])){
                ch[i]=Character.toUpperCase(ch[i]);
            }

            //for capitalizing the end of sentence
            if(i==end && ch[i]!=' '){
                ch[i]=Character.toUpperCase(ch[i]);
            }


            }
            for(char c:ch){
                System.out.print(c);
            }
        }
}


