package com.MD;
//LC 1095
// binary search Q video YouTube
//https://leetcode.com/problems/find-in-mountain-array/
public class MountainArray {
    public static void main(String[] args) {

    }

    int search(int[] arr , int target){
        int peak = PeakIndexofArr(arr);
        int FirstHalf = orderAgnosticSearch(arr , target, 0 , peak);
        if(FirstHalf != -1){
            return FirstHalf;
        }
        return orderAgnosticSearch(arr, target ,peak+1 , arr.length-1);
    }
    public int PeakIndexofArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while( start < end){
            int mid  = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
//                desc part
                end = mid;
            }else {
//                asc part
                start = mid + 1;
            }
        }
        return start;    // we can also return end index since both will point to same number at the end
    }
    static int orderAgnosticSearch(int[] array , int target , int start , int end){
        boolean check = array[start] < array[end];
        while(start <= end){
//            int mid = (start + end) / 2;   // if the start + end exceeds the integer range than we might get a problem
            int mid  = start + (end - start) / 2;
            if(array[mid] == target){
                return mid;
            }
            if(check){
                if (target < array[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else {
                if (target > array[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
