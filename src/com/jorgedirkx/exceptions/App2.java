package com.jorgedirkx.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {
    public static void main(String[] args)  {
        File file = new File("test.txt");
        // try to run this and see if it throws an exception
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // or System.out.println(file not found: + file.toString());
        }
    }
}
