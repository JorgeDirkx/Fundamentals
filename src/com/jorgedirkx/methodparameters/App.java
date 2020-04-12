package com.jorgedirkx.methodparameters;

class Robot{

    public void speak(String text){
        System.out.println(text);
    }

    public void move(String direction, double distance){
        System.out.println("moving: " + direction + " the distance is: " + distance);
    }

}

public class App {
    public static void main(String[] args) {

        Robot john = new Robot();
        john.speak("hello there");

        String text2 = "thanks";
        john.speak(text2);

        john.move("east", 100);


    }
}
