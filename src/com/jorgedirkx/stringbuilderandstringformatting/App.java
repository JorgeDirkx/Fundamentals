package com.jorgedirkx.stringbuilderandstringformatting;

public class App {

    public static void main(String[] args) {

        //formatting
        System.out.printf("total cost %-10d; quantity is %d\n", 5, 20 );

        for(int i = 0; i <10; i++){
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        //formatting floating point value
        System.out.printf("total value: %6.1f\n", 343.234);

        //Stringbuilder

        StringBuilder sb = new StringBuilder("hello "); // we can add text already
        sb.append("my name is John");
        sb.append("age 25");

        System.out.println(sb.toString());

    }
}
