package com.jorgedirkx.trywithresources;

import java.io.*;

public class App2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.text");

        //FileReader fr = new FileReader(file); instead put Filereader(file) in new BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader(file))){

        }catch (FileNotFoundException e){
            System.out.println("cant find the file " + file.toString());
        }catch (IOException e){
            System.out.println("unable to read file " + file.toString());
        }
    }
}
