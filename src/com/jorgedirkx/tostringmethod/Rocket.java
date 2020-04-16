package com.jorgedirkx.tostringmethod;

public class Rocket {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(name);
        //return sb.toString(); is possible OR:
        return String.format("%d, %s",id, name);
    }

}


