package com.jorgedirkx.staticandfinal;

import javax.sound.midi.Soundbank;

class Thing{

    //instance variable
    public String name;

    //static or class variable; belongs to the class therefor there is only one copy
    public static String description;

    public final static int LUCKY_NUMBER = 7;

    public static int count = 0;
    public int id;

    //constructor; whatever code you put inside the constructor, it will run once you make an object
    public Thing(){
        count++;
        id = count;
    }

    //instance method
    public void showName(){
        System.out.println("object id: "+ id +" "+name);
    }

    //static method; can NOT access instance variables
    public static void showInfo(){
        System.out.println(description);
    }
}
public class App {
    public static void main(String[] args) {

        System.out.println("before creating an object count is: " + Thing.count);
        Thing thing1= new Thing();
        Thing thing2 = new Thing();
        System.out.println("after creating an object count is: " + Thing.count);

        thing1.name = "box";
        Thing.description = "i am a thing";

        thing2.name = "box 2";

        thing1.showName();
        thing2.showName();

        Thing.showInfo();
        
        System.out.println(thing1.name);
        System.out.println(Thing.description);

        //sample of MATH class
        System.out.println(Math.PI);
    }
}
