package com.jorgedirkx.arraylist;

import java.util.ArrayList;

public class App {

    //ARRAYLIST: COLLECTIONS FRAMEWORK

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //adding
        numbers.add(50);
        numbers.add(80);
        numbers.add(83);

        //retrieving
        System.out.println(numbers);
        //retrieving with index
        System.out.println(numbers.get(2));

        //Loop iteration #1
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //For each iteration #2
        for (Integer value : numbers) {
            System.out.println(value);
        }

        //Removing items
        numbers.remove(numbers.size()-1);

    }
}
