package com.mihir;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter the number of first  Fibonacci series: ");
        int c = x.nextInt();
        for(int i = 0; i < c ; ++i){
            int d = a+b;
            System.out.println( +d);
            a=b;
            b=d;

        }
    }
}
