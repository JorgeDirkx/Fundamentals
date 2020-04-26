package com.jorgedirkx.recursion;

public class App {

    // recursion: method calls itself; same method in particular method

    public static void main(String[] args) {

        //static method called:
        calculate(8);

    }

    public static void calculate(int value) {
        //loops till 1 cause of method number 2 !
        System.out.println(value);
        if (value == 1) {
            return;
        }
        //method number 2 !
        calculate(value - 1);
    }
}
