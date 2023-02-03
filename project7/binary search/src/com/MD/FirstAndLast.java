package com.MD;
//        infinite array problem where length of the array is not known to us in short we can't use the .length method.
public class FirstAndLast {
    public static void main(String[] args) {
//        Start with size of 2
        int[] arr = {2 ,3 ,5 ,6 ,7 ,8 ,10 ,11 ,12 ,15 ,20 ,23 ,30}; // The array can be of infinite size and we are not
//                                                                     using (.length) method
        int target = 10;
        System.out.println(ans(arr , target));
    }
    static int ans(int[] arr, int target){
        int start =0;
        int end = 1;
//        condition for the target to lie in the range
        while(target > end){
            int temp = end + 1;
//            double the range
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] array , int target ,int start ,int end){
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
}
