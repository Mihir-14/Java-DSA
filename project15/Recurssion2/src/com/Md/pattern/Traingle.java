package com.Md.pattern;

import java.util.Arrays;

public class Traingle {
    public static void main(String[] args) {
//        triangle2(4,0);
        int[] nums = {4,3,2,1,0};
//        bubblesort(nums , nums.length - 1 , 0);
        selectionsort(nums , nums.length  , 0 , 0);
        System.out.println(Arrays.toString(nums));
    }


    static void triangle(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            triangle(row , col+1);
        }else {
            System.out.println();
            triangle(row-1 , 0);
        }
    }


    static void triangle2(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            triangle2(row , col+1);
            System.out.print("* ");
        }else {
            triangle2(row-1 , 0);
            System.out.println();
        }
    }


    static void bubblesort(int[] arr , int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1] ){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp ;
            }
            bubblesort(arr ,r , c+1);
        }else {
            bubblesort(arr ,r-1 , 0);
        }
    }


    static void selectionsort(int[] arr,int r , int c , int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionsort(arr , c ,c+1 ,c);
            }else {
                selectionsort(arr , c ,c+1 ,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr,r-1 , 0,0);
        }
    }
}
