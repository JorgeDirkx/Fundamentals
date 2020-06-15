package com.jorgedirkx.encapsulationandapi;

public class Machine {

    public static final int ID = 10;

   //private variables declared, can only be accesed by public methods of class
    private String name;

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public int calculatGrowF(){
        return 9;
    }

    public String getData(){
        String data = "some stuff" + calculatGrowF();
        return data;
    }
}
