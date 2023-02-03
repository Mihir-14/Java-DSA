package com.Md;

public class Main {
    public static void main(String[] args) {
//        Q store 5 roll number
        int[] rollNo = new int[5];
//        or
        int[] roll_no = {1,2,3,4,5};
//        All the data types inside the array will be of single type only
//        In java the array elements are not stored in continuous fashion though it is an array
//        since it is stored in heap memory
//        It fully depends on JVM
        System.out.println(rollNo[3]);
        String[] name = new String[6];
        System.out.println(name[3]);

    }
}