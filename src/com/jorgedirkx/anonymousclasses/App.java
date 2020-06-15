package com.jorgedirkx.anonymousclasses;

public class App {
    public static void main(String[] args) {

        //an anonymous class is a subclass of a superclass or class which implements a certain interface
        //the anonymous class replaces methods of the interface or superclass

        Machine machine1 = new Machine(){
            //ANONYMOUS CLASS
            @Override
            public void start() {
                System.out.println("camera starts");
            }
        };
        machine1.start();
    }
}
