package com.MD;

public class Search {
//    If Ascending order array is given
    public static void main(String[] args) {
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        int t = 2;
        int ans = binarySearch(arr , t);
        System.out.println(ans);
    }
    static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
//            int mid = (start + end) / 2;   // if the start + end exceeds the integer range than we might get a problem
            int mid  = start + (end - start) / 2;
            if (target < array[mid]){
                start = mid + 1;
            } else if (target > array[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
