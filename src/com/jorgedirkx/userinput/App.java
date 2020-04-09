package com.jorgedirkx.userinput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("enter a text");
        String line = input.nextLine();
        System.out.println("you entered:" +" " + line);

        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println("you entered number:" + " " + number);

    }
}
