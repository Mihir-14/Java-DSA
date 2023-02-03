package com.MD;
//LC 410
public class SplitArray {
    public static void main(String[] args) {

    }
    public int Splitarr(int[] nums, int m){
        int start = 0 ;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start , nums[i]);
            end = end + nums[i];
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0 ;
            int piece = 1;
            for (int num:nums ) {
                if (sum + num > mid){
                    sum = num;
                    piece++;
                }else {
                    sum =sum + num;
                }
                
            }
            if(piece > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end;
    }
}
