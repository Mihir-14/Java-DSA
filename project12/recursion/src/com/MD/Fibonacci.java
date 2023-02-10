package com.MD;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(60));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2); // first fibo(n-1) will execute and then the fibo(n-2) will execute
    }
}
