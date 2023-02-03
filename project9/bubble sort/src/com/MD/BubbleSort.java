package com.MD;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        BubbeSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void BubbeSort(int[] arr){
//        boolean swapped;
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
    }
}