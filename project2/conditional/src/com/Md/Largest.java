package com.Md;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        } else if (c > max) {
//            max = c;
//        }
        int max = Math.max(a,Math.max(b,c));
        System.out.println("The maximum number is : " +max);
    }
}
