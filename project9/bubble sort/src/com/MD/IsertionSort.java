package com.MD;

import java.util.Arrays;

public class IsertionSort {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
     }
    static void insertionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(array[j] < array[j-1]){
                    Swap(array , j , j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
