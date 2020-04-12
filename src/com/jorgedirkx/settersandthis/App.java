package com.jorgedirkx.settersandthis;

class Astronaut{

    private String name;
    private int age;

    //setters

    public void setName(String name){
        //this refers to the instance variable, =name refers to the parameter
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //getters

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //usage of method in method
    public void setInfo(String name, int age){
        setAge(age);
        setName(name);
    }

}
public class App {
    public static void main(String[] args) {

        Astronaut a1= new Astronaut();
        a1.setInfo("Buzz Lightyear", 25);

    }
}
