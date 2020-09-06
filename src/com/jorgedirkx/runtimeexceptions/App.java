package com.jorgedirkx.runtimeexceptions;

public class App {
    public static void main(String[] args) {
        //checked exceptions you are forced to handle, checked at compile time
        int value = 7;
        value = value/0;
        //unchecked (runtime) exceptions are basic fundamentals error, checked at runtime

        //nullpointer exception as there is nothing to run, easy fixable, variable is not referencing anything
        String text = null;
        System.out.println(text. length());
    }
}
