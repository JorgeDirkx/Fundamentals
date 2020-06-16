package com.jorgedirkx.abstractclasses;

public class Camera  extends Machine{
    @Override
    public void start() {
        System.out.println("start camera");
    }

    @Override
    public void doStuff() {
        System.out.println("do camera stuff");

    }

    @Override
    public void shutdown() {
        System.out.println("shutdown camera");

    }
}
