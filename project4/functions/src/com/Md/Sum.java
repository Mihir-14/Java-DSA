package com.Md;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int a = x.nextInt();
        System.out.print("Enter the number 2:");
        int b = x.nextInt();
        int Ans = sum(a,b);
        int ans = sum(40,30);
        System.out.println(Ans);
        System.out.println(ans);

    }
    static int sum(int p,int q){
        int sum = p + q;
        return sum;
    }
}
