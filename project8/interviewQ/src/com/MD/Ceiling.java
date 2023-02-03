package com.MD;
// celling or floor in binary search
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
//        int[] arr ={48,36,20,14,12,11,9,6,4,2};
        int t = 96;
        int ans = binarySearch(arr , t); // this return the index of the array
        System.out.println(ans);
//        System.out.println(arr[ans]);
    }
    //    return the index
//    return -1 if it is not present in the array
    static int binarySearch(int[] array , int target){
        if(target > array[array.length-1]){
            return -1;
        }
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
        return start;  // when the given array is in ascending order and we have to find the celling then return start
//        return end;    // when the given array is in ascending order and we have to find the floor then return end
    }
}