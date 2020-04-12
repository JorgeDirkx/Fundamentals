package com.jorgedirkx.constructors;

class Machine {

    private String name;
    private int age;

    //constructors
    public Machine() {
        //a constructor within a constructor, put this first
        this("machine one", 0);
        System.out.println("first constructor is running");
    }

    public Machine(String name) {
        this(name, 0);

        this.name = name;
        System.out.println("second constructor is running");
    }

    public Machine(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("third constructor is running");
    }
}


public class App {
    public static void main(String[] args) {

        Machine m1 = new Machine();
        /*Machine m2 = new Machine("machine 2");
        Machine m3 = new Machine("machine 3", 34);*/

    }
}
