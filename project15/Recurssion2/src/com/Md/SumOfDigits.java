package com.Md;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = Digit(1234);
        System.out.println(ans);
    }
    static int Digit(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + Digit(n / 10);
    }
}
