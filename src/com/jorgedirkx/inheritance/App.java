package com.jorgedirkx.inheritance;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.start();
        car1.stop();

        Toyota hybrid = new Toyota();
        hybrid.start();
        hybrid.stop();
        hybrid.wipeWindhshield();
    }
}
