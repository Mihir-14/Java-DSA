package com.MD;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] x ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10}
        };
        int target = 99;
        int[] ans = search(x,target);  // returned will be in the format of {row , col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(x));
    }
    static int[] search(int[][] array , int num){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
               if (array[row][col] == num){
                   return new int[] {row, col};
               }
            }
        }
        return new int[] {-1,-1};
    }
//    returning the Maximum value of 2D array
    static int max(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max){
                    max = array[row][col];
                }
            }
        }
        return max;
    }
}
