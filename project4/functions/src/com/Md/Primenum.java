package com.Md;

import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a =x.nextInt();
        boolean b = isPrime(a);
        if (b == false){
            System.out.println("The enter value is not a prime number");
        }else {
            System.out.println("The enter value is a prime number");
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
