package com.jorgedirkx.dowhile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.println("enter a number");
            number = input.nextInt();
        }
        while (number != 5);
        System.out.println("the number input is indeed 5");
    }

}
