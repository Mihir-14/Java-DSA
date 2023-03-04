package com.Md.array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        System.out.println(search(nums , 10000 , 0 , nums.length-1));
    }
    static int search(int[] arr , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end  - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return search(arr , target , start , mid-1);
            }else {
                return search(arr , target , mid+1 , end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return search(arr , target , mid+1 , end);
        }
        return search(arr , target , start , mid-1);
    }
}
