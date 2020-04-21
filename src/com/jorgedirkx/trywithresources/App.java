package com.jorgedirkx.trywithresources;

public class App {
    public static void main(String[] args) {

            Car car1= new Car();
            try{
                car1.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            //try with resources. close method is AUTOMATICALLY CALLED !!!
            try(Car car2 = new Car()) {
            }catch (Exception e){
                e.printStackTrace();
            }

    }
}
