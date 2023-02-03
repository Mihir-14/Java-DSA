package com.MD;
//LC 852,162
// binary search Q video youtube
public class PeakIndexMountainArray {
    public static void main(String[] args) {

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
}
