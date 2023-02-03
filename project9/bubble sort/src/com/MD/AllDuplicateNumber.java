package com.MD;

import java.util.ArrayList;
import java.util.List;

//LC 442
public class AllDuplicateNumber {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                Swap(nums, i ,correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1 ){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
