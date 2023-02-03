package com.Md;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr ={12,13,14,15,16};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maximum =arr[0];
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > maximum){
                maximum =arr[i];
            }
        }
        return maximum;
    }
}
