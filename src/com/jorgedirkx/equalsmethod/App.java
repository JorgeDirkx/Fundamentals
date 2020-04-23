package com.jorgedirkx.equalsmethod;

public class App {
    public static void main(String[] args) {

        //string literal s1 and s2
        String s1 = "abc";
        String s2 = "abc";

        //output will be true: both s1 and s2 refer to the same object, not a problem as a String is unchangeable
        System.out.println(s1==s2);

        //when we create a String with a constructor, we are creating a new object
        String s3 = "def";
        String s4 = new String("def");

        //output will be false: s3 and s4 are two different objects
        System.out.println(s3==s4);

        //when we'd like to compare the contents of two Strings: we use the equals() method
        String name1 = "John";
        String name2 = new String("John");
        System.out.println(name1.equals(name2));

        String name3 ="Bart";
        String name4 ="John";
        System.out.println(name3.equals(name4));
    }
}
