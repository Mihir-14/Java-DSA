package com.MD;
//Given an array nums of integers, return how many of them contain an even number of digits.
public class LeetCode {
    public static void main(String[] args) {
        int[] arr ={555,901,482,1771};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        if(numberOfDigits % 2 ==0){
            return true;
        }
        return false;
    }
    static int digits(int number){
        int count = 0;
        if(number < 0){
            number = number * -1;
        }
        if(number == 0){
            return 1;
        }
        while (number > 0){
            count++;
            number = number / 10;
        }
        return count;
    }
}
