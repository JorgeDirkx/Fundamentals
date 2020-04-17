package com.jorgedirkx.upanddowncasting;

public class App {
    public static void main(String[] args) {

        Camera camera1 = new Camera();

        //upcasting
        Machine machine1 = camera1;
        machine1.start(); //output: "start camera". note: you can NOT access the method snap

        //downcasting
        Machine machine2 = new Camera();
        machine2.start();

        Camera camera2 =(Camera) machine2;
        camera2.snap();

    }
}
