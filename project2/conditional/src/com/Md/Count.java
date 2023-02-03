package com.Md;

public class Count {
    public static void main(String[] args) {
        int x = 666666;
        int count = 0;
        while (x > 0){
            int rem = x % 10;
            if(rem == 9){
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }
}
