package com.MD;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {8,7,6,3,2,1};
        Selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void Selection(int[] array){
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxindex(array , 0 ,last);
            Swap(array , maxIndex , last);
        }
    }
    static int getMaxindex(int[] arr , int start , int end){
        int max = start;
        for (int i = 0; i < end; i++) {
            if(arr[max]< arr[i]){
                max = i ;
            }
        }
        return max;
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
