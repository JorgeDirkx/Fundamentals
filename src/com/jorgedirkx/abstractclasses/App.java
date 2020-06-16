package com.jorgedirkx.abstractclasses;

public class App {
    public static void main(String[] args) {

        //difference between interface and abstract class: interface has a functionality, with abstract class you determine a parent class
        //strong statement, a car is a machine etc...a class can implement many interfaces but can only have one parent class

        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        car1.run();


    }
}
