package com.MD;
//LC 268
class Solution {
    public int missingNumber(int[] array) {
        int i = 0;
        while (i < array.length){
            int correct = array[i];
            if(array[i] < array.length && array[i] != array[correct]){
                Swap(array, i ,correct);
            }else {
                i++;
            }
        }
//        Case 1 when the value is more than the length of the array
        for (int index = 0; index < array.length; index++) {
            if(array[index] != index){
                return index;
            }
        }
//        Case 2 when the missing value is equal to the array.length
        return array.length;



    }
    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}