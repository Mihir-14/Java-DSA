package com.MD;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,-69,9,9,9,9};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int max(int[] array) {
        int ans = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > ans){
                ans = array[i];
            }
        }
        return ans;
    }

    //Assume arr.length != 0
    static int min(int[] array) {
        int ans = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < ans){
                ans = array[i];
            }
        }
        return ans;
    }
}
