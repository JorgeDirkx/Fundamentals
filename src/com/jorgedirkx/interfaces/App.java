package com.jorgedirkx.interfaces;

public class App {

    public static void main(String[] args) {

        Boat boat1 = new Boat();
        boat1.setId(1);
        boat1.setName("the Torpedo");
        boat1.showInfo();

        //This is also possible because Boat implements Info
        Info info1 = new Boat();
        info1.showInfo();

        //Also possible, because boat1 is a reference to Boat which implements Info:
        Info info2 =boat1;
        info2.showInfo();

        Person person1 = new Person("John");
        person1.showInfo();

    }
}
