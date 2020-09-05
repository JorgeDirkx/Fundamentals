package com.jorgedirkx.arrays;

public class App {
    public static void main(String[] args) {

        int[] values = new int[3];

        values[0]= 1;
        values[1]= 2;
        values[2]= 3;
        System.out.println(values[0]);

        int[] values2 = new int[2];

        values2[0]= 5;
        System.out.println(values2[0]);

        //iterate an array; the length of the array is 3 but the columns are 0,1 and 2 !
        for(int i = 0; i< values.length; i++){
            System.out.println(values[i]);
        }

        for(int i=0; i<values2.length; i++){
            System.out.println(values2[i]);
        }


        //for each
        for (Integer numbers:values2
             ) {
            System.out.println(numbers);

        }



    }
}
