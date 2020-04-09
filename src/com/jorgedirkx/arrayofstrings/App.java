package com.jorgedirkx.arrayofstrings;

public class App {
    public static void main(String[] args) {

        //standard empty ref. text
        String text = null;

        String[]fruits = {"apple", "banana", "kiwi"};

        //for each loop
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
