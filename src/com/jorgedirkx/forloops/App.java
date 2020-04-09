package com.jorgedirkx.forloops;

public class App {
    public static void main(String[] args) {
        //for ( ; ; ){} infinite loop

        //for loop: if i is smaller then 0, it prints the command, increments, then checks again i<5, prints again...
        for (int i = 0; i < 5; i++) {
            System.out.println("value of i:" + " " + i);
            //as format specifier
            System.out.printf("value of i: %d\n", i);
        }
    }
}