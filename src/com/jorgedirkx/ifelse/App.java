package com.jorgedirkx.ifelse;

public class App {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        if(number1 <number2){
            System.out.println("number 1 is smaller then number 2");
        }
        else if(number1 == number2) {
            System.out.println("number 1 and 2 are the same");
        }
        else{
            System.out.println("number 1 is bigger then number 2");
        }

        while(true){
            if( number1 == 8){
                break;
            }
            number1++;
            System.out.println("running");
        }

    }
}
