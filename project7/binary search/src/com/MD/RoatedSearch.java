package com.MD;
//lc 33
public class RoatedSearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums , int target ){
        int pivot = Pivot(nums);
        if(pivot == -1){
            return binarySearch(nums , target ,0 , nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        return 0;   // wrong
    }

    static int binarySearch(int[] array , int target , int start , int end){
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
    static int Pivot(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && array[mid] > array[mid + 1]){
                return mid;
            } else if (mid > start && array[mid] < array[mid - 1]){
                return mid-1;
            } else if (array[mid] <= array[start]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
