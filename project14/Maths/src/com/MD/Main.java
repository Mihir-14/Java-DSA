package com.MD;

public class Main {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 0; i <= n; i++) {
            if(isPrime(i) == true){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int num = 2;
        while (num * num <= n){
            if(n % num == 0){
                return false;
            }
            num++;
        }
        return true;
    }
}