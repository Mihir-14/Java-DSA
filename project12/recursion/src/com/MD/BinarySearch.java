package com.MD;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int ans = search(arr,7,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] array , int target , int start , int end ){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(array[mid] == target){
            return mid;
        }
        if(target < array[mid]){
            return search(array , target , start , mid-1);
        }
        return search(array , target, mid+1, end);
    }
}
