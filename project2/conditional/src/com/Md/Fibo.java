package com.Md;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a  = x.nextInt();
        int p = 0;
        int q = 1;
        int count = 2;
        while (count <= a){
            int temp = q;
            q = q + p;
            p = temp;
            count++;
        }
        System.out.println(q);
    }
}
