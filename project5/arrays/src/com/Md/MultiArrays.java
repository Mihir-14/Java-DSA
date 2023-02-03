package com.Md;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][]; // numbers of rows should be mentioned but not the column it is not
//                                     compulsory
//        int[][] a = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15}
//        };
//        System.out.println(Arrays.toString(a));
        Scanner x = new Scanner(System.in);
        int [][] arr = new int[3][3];
//        System.out.println(arr.length); // This print out the number of rows in 2D arrays
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= x.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
