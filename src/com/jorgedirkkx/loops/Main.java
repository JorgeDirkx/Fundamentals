package com.jorgedirkkx.loops;

public class Main {
    public static void main(String[] args) {
        int value;
        value = 1;

        /*
        while (value<10){
            System.out.println("this will be an infinite loop");
        }
        */

        while (value<10){
            System.out.println("value is:" + " " + value);
            value = value + 1;
        }
    }
}
