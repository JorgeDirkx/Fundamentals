package com.jorgedirkx.castingnumericvalues;

public class App {

    public static void main(String[] args) {

        //data of a certain type can be forced to another type

        int intValue = 123;
        long longValue = 2345;

        float floatValue = 8845.8f;

        intValue = (int) longValue;

        intValue =(int)floatValue;

        System.out.println(longValue);
        System.out.println(intValue);
    }
}
