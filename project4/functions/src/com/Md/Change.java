package com.Md;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int[] num) {
        num[0] = 69; // if we make the changes using reference variable same object will be changed
                    //        we cannot create and replace it
    }
}
