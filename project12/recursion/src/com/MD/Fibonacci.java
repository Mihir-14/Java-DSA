package com.MD;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fibFormula(i)); 
        }
    }
    static int fibFormula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2) , n) - Math.pow(((1-Math.sqrt(5))/2) , n)) / Math.sqrt(5));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2); // first fibo(n-1) will execute and then the fibo(n-2) will execute
    }
}
