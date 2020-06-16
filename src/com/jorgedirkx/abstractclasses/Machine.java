package com.jorgedirkx.abstractclasses;

public abstract class Machine { //using the word abstract derives the user of instantiating a Machine object,
    //as it is abstract, a machine does not exist, a car or a camera does

    //common functionality
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();

    public void run(){
        start();
        doStuff();
        shutdown();
    }
}
