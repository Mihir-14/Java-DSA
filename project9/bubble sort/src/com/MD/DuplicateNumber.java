package com.MD;
//LC 287
public class DuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    Swap(nums, i ,correct);
                }else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
