package com.jorgedirkx.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {


        //generic classes = parametired classes

        ArrayList<String> list = new ArrayList<>();
        list.add("type1");

        String t1 = list.get(0);

        System.out.println(t1);

    }

}
