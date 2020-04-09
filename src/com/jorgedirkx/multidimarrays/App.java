package com.jorgedirkx.multidimarrays;

public class App {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 5, 7},
                {5, 10, 8}};

        //iterate through 2dim. array
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.println(grid[row][col]);
            }
        }
    }
}
