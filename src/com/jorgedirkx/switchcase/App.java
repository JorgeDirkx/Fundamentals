package com.jorgedirkx.switchcase;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a command");
        String text = input.nextLine();

        switch (text){
            case  "start":
                System.out.println("start the machine");
                break;
            case  "stop":
                System.out.println("stop the machine");
                break;
            default:
                System.out.println("command not recognised");
        }
    }
}
