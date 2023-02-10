package com.MD;

public class Numbers {
    public static void main(String[] args) {
//        write a function that takes a number and print it
//        print first 5 number  1 2 3 4 5
        print1(1);
    }
    static void print1(int n){
        if(n == 10){
            return;
        }
        System.out.println(n);
        print1(n+1); // This is called Tail recursion since it is the last function call
//        If we call the function again and again you can treat it as separate call in the stack
    }
}
