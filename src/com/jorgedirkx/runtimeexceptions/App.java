package com.jorgedirkx.runtimeexceptions;

public class App {
    public static void main(String[] args) {
        //checked exceptions you are forced not handle, runtime exceptions not
        int value = 7;
        value = value/0;
        //runtime exceptions are basic fundamentals error, should have adressed prior

        //nullpointer exception as there is nothing to run, easy fixable, variable is not referencing anything
        String text = null;
        System.out.println(text. length());
    }
}
