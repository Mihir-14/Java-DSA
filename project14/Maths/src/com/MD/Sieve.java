package com.MD;

public class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] arr = new boolean[n+1];
        Prime(n , arr);
    }

//    False in arr means it is prime
//    True means it is not prime
    static void Prime(int n ,boolean[] nums){
        for (int i = 2; i*i <= n; i++) {
            if(!nums[i]){
                for (int j = 2*i; j <= n; j = j + i) {
                    nums[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!nums[i]){
                System.out.print(i + " ");
            }
        }
    }
}
