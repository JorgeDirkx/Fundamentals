package com.jorgedirkx.trywithresources;

public class Car implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closing !");
    }
}

