package com.Md.array;

public class Sorted {
    public static void main(String[] args) {
        int[] nums = {1,3,4,7,11,9,10};
        System.out.println(sorted(nums , 0));
    }
    static boolean sorted(int[] arr , int index ){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr , index+1);
    }
}
