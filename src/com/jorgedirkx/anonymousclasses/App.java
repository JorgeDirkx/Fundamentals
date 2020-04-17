package com.jorgedirkx.anonymousclasses;

public class App {
    public static void main(String[] args) {

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
