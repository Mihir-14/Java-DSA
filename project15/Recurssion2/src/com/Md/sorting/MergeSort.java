package com.Md.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3,1};
//        nums = mergesort(nums);
//        System.out.println(Arrays.toString(nums));
        mergesortInPlace(nums , 0 , nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static int[] mergesort(int[] arr){
//        This is not the inplace Function
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr , 0 ,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr , mid , arr.length));

        return merge(left , right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

//        If  anyone of the array is finished and other is remaining
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


//    Inplace Merge sort Code
    static void mergesortInPlace(int[] arr , int start , int end){
        //        This is not the inplace Function
        if((end-start) == 1){
            return ;
        }
        int mid = (start + end) / 2;
        mergesortInPlace(arr , start ,mid);
        mergesortInPlace(arr , mid , end);

        mergeInPlace(arr , start , mid , end);
    }

    private static void mergeInPlace(int[] arr, int start , int mid , int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while( i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

//        If  anyone of the array is finished and other is remaining
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
