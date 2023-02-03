package com.Md;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        swapping(arr , 2 , 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse (int[] array){
        int start = 0;
        int end = array.length-1;
        while(start < end){
            swapping(array, start,end);
            start++;
            end--;
        }
    }
    static void swapping(int[] arr, int id1 ,int id2){
        int temp =arr[id1];
        arr[id1] = arr[id2];
        arr[id2] =temp;
    }
}
