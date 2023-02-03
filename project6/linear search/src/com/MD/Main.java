package com.MD;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,-2,-11};
        int target =-27;
        boolean a= linearSearch3(arrays,target);
        System.out.println(a);
    }

//    Searching the element and returning the index value
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
    // Searching the element and returning element
    static int linearSearch2(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    // Searching the element and returning true or false
    static boolean linearSearch3(int[] arr , int target){
        if(arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}


