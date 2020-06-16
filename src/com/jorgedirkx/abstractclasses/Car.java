package com.jorgedirkx.abstractclasses;

public class Car extends Machine {
    @Override
    public void doStuff() {
        System.out.println("do car stuff");

    }

    @Override
    public void shutdown() {
        System.out.println("shutdown car");

    }

    @Override
    public void start() {
        System.out.println("start car");

    }
}
