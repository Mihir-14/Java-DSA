package com.MD;

import java.util.Set;

public class Main {
//    If Ascending order array is given
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int t = 5;
        int ans = binarySearch(arr , t);
    }
//    return the index
//    return -1 if it is not present in the array
    static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
//            int mid = (start + end) / 2;   // if the start + end exceeds the integer range than we might get a problem
            int mid  = start + (end - start) / 2;
            if (target < array[mid]){
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}