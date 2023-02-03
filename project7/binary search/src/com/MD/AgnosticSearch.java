package com.MD;

public class AgnosticSearch {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        System.out.println(orderAgnosticSearch(arr , 69));
    }
    static int orderAgnosticSearch(int[] array , int target){
        int start = 0;
        int end = array.length-1;
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
