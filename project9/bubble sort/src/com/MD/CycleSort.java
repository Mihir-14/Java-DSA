package com.MD;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] array){
        int i = 0;
        while (i < array.length){
            int correct = array[i] - 1;
            if(array[i] != array[correct]){
                Swap(array, i ,correct);
            }else {
                i++;
            }
        }
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
