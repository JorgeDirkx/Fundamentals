package com.jorgedirkx.methods;

//encapsulation: data of one class is hidden for other classes

    class Person {

        // instance variable
        String name;
        int age;

        //method
        int calculateYearsToRetirement() {
            int yearsleft = 65 - age ;

            return yearsleft;
        }


        //GETTERS
        int getAge(){
            return age;
        }

        String getName(){
            return name;
        }


    }

    public class App {
        public static void main(String[] args) {

            //class is a blueprint of an object

            //Type  Variable, Creating the object
            Person person1 = new Person();

            person1.name = "Jorge";
            person1.age = 24;

            int years = person1.calculateYearsToRetirement();

            int ageOfPerson1 = person1.getAge();

        }
    }


