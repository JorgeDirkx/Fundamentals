package com.jorgedirkx.upanddowncasting;

public class Camera extends Machine {
    //child class

    @Override
    public void start() {
        System.out.println("start camera");
    }

    public void snap(){
        System.out.println("snap !");
    }
}
