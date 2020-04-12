package com.jorgedirkx.classesandobjects;

class Person {

    // instance variable
    String name;
    int age;
}

public class App {
    public static void main(String[] args) {

        //class is a blueprint of an object

        //Type  Variable, Creating the object
        Person person1 = new Person();

        person1.name = "Jorge";
        person1.age = 24;

    }
}
