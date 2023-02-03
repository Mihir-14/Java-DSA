package com.Md;

import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
//        Arrays are mutable in JAVA
        int[] x = {1,2,3,4,5};
        System.out.println(Arrays.toString(x));
        change(x);
        System.out.println(Arrays.toString(x));
    }
    static void change(int[] arr){
        arr[0]= 69;
    }
}
