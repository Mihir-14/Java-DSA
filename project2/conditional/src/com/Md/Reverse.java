package com.Md;

public class Reverse {
    public static void main(String[] args) {
        int x = 123456789;
        int ans = 0;
        while(x > 0){
            int rem = x % 10;
            x = x / 10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}
