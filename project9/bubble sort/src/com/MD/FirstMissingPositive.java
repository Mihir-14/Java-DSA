package com.MD;
//LC 41
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 &&nums[i] <= nums.length && nums[i] != nums[correct]){
                Swap(nums, i ,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return  nums.length+1;
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
