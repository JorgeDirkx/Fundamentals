package com.jorgedirkx.inheritance;

public class Toyota extends Car {

    //child class

    public void wipeWindhshield(){
        System.out.println("wipe the Toyota windows");
    }

    @Override
    public void start() {
        System.out.println("start the Toyota");
    }

    @Override
    public void stop() {
        System.out.println("stop the Toyota");
    }
}
