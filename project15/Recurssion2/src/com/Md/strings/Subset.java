package com.Md.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Time Complexity :- O(N * (2^N))
//Space Complexity :- O(2^N * N)
public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        List<List<Integer>> ans= sub(nums);
////        System.out.println(ans);
//        for (List<Integer> l : ans){
//            System.out.println(l);
//        }
        int[] number = {1,2,2};
        List<List<Integer>> ans= dublicate(number   );
//        System.out.println(ans);
        for (List<Integer> l : ans){
            System.out.println(l);
        }
    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); // copy of outer list
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> dublicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i= 0 ; i < arr.length ; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j)); // copy of outer list
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
