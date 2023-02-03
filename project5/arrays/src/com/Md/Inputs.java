package com.Md;

import javax.security.sasl.SaslClient;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
//        Arrays of primitive
//        int[] arr = new int[5];
//        arr[0]=69;
//        arr[1]= 79;
//        arr[2]= 89;
//        arr[3]= 99;
//        arr[4]= 109;
//        System.out.println(arr[2]);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = x.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int z : arr) { //for every element in array print the element
//            System.out.print(z + " "); //here z represents element of the array
//        }


//        Arrays of objects
        String[] a = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = x.next();
        }
        System.out.println(Arrays.toString(a));
    }
}
