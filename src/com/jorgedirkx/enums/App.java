package com.jorgedirkx.enums;

public class App {
    public static void main(String[] args) {

        //prints out all Enum instances:
        for(Color c: Color.values()){
            System.out.println(c);
        }

        /*//instance Enum assigning with "..."
        Color color = Color.valueOf("PINK");*/

        Color color1 = Color.WHITE;
        System.out.println(color1);

        //or:

        System.out.println(color1.name());

        //sequence number of the enum that was set
        System.out.println(color1.ordinal());

        //using the printColor method
        printColor(color1);
    }

    public static void printColor(Color color){
        String text =null;
        switch (color){
            case BLACK: text = "Black";
            break;
            case WHITE: text = "White";
            break;
            case YELLOW: text = "Yellow";
        }
        System.out.println(text);
    }
}
