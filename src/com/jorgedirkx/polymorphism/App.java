package com.jorgedirkx.polymorphism;


class Bicycle {
    void run() {
        System.out.println("paddle");
    }
}

class Bmx extends Bicycle {
    void run() {
        System.out.println("paddle and jump over the hills ");
    }
}
public class App {

    //Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism
    // in OOP occurs when a parent class reference is used to refer to a child class object


    public static void main(String[] args) {

        Bicycle bike1 = new Bmx(); //upcasting
        bike1.run();
    }
}

