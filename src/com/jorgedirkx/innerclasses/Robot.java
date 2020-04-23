package com.jorgedirkx.innerclasses;

public class Robot {

    private int id;

    //nested class
    class Brain{
        public void think(){
            System.out.println("Robot with id: "+ id + " is thinking." );
        }
    }

    //static nested class: group it with an outer class without having access to the properties of that class
    public static class Battery{
        public void charge(){
            System.out.println("Battery charging...");
        }
    }

    public Robot (int id){
        this.id = id;
    }

    // method + innerclass !
    public void start(){
        System.out.println("starting robot: "+ id);
        Brain brain = new Brain();
        brain.think();
        // nested class in a method:
        final String name = "John";
        class Temp{
            public void doSomething(){
                System.out.println("ID: " + id);
                System.out.println("My name is " + name);
            }
        }
        //outside scope class Temp: creating object temp1 !
        Temp temp1 = new Temp();
        temp1.doSomething();
    }

}
