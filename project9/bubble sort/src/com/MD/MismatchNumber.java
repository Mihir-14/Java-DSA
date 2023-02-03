package com.MD;
//LC 645
public class MismatchNumber {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                Swap(nums, i ,correct);
            }else {
                i++;
            }
        }
//        Case 1 when the value is more than the length of the array
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
