package com.jorgedirkx.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.FileHandler;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fileReader = new FileReader(file);
    }


}
