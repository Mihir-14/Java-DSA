package com.Md.array;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,4,8,9};
//        System.out.println(find(arr , 8 , 0));
//        System.out.println(findIndex(arr , 4 , 0));
//        System.out.println(findIndexLast(arr , 4 ,arr.length-1));
//        findAllIndex(arr ,10 ,0);
//        System.out.println(a);
//        System.out.println(findAllIndex2(arr ,4 , 0 ,new ArrayList<>()));
        System.out.println(findAllIndex3(arr , 4 , 0));

    }
//    Is number mentioned in the array
    static boolean find(int[] nums , int target , int index){
        if(index == nums.length){
            return false;
        }
        return nums[index] == target || find(nums , target , index+1);
    }
//    index of the number mentioned in the array occurring first time from the beginning
    static int findIndex(int[] nums , int target , int index){
        if(index == nums.length){
            return -1;
        }
        if( nums[index] == target){
            return index;
        }else {
            return  findIndex(nums , target , index+1);
        }
    }
//    index of the number mentioned in the array occurring first time from the end
    static int findIndexLast(int[] nums , int target , int index){
        if(index == -1){
            return -1;
        }
        if( nums[index] == target){
            return index;
        }else {
            return  findIndexLast(nums , target , index-1);
        }
    }

//    All the index of the number mentioned in the array
    static ArrayList<Integer> a =new ArrayList<>();
    static void findAllIndex(int[] nums , int target , int index){
        if(index == nums.length){
            return;
        }
        if( nums[index] == target){
            a.add(index);
        }
        findAllIndex(nums , target ,index+1);
    }

    static ArrayList<Integer> findAllIndex2(int[] nums , int target , int index , ArrayList<Integer> lst){
        if(index == nums.length){
            return lst;
        }
        if( nums[index] == target){
            lst.add(index);
        }
        return findAllIndex2(nums , target ,index+1 , lst);
    }

    static ArrayList<Integer> findAllIndex3(int[] nums , int target , int index ){
        ArrayList<Integer> lst = new ArrayList<>();

        if(index == nums.length){
            return lst;
        }
//        This will contain the answer for that particular call only
        if( nums[index] == target){
            lst.add(index);
        }
        ArrayList<Integer> ans = findAllIndex3(nums , target ,index+1 );
        lst.addAll(ans);
        return lst;
    }
}
