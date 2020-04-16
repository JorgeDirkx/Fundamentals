package com.jorgedirkx.tostringmethod;

public class App {
    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        rocket1.setId(1);
        rocket1.setName("Apollo 1");

        //printing an object will look for the toString method in the object class
        System.out.println(rocket1);
    }
}
