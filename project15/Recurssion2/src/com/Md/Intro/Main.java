package com.Md.Intro;

public class Main {
    public static void main(String[] args) {
        functionRev(5);
    }
    static void function(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        function(n-1);
    }
    static void functionRev(int n){
        if(n == 0){
            return;
        }
//        System.out.print(n + " ");
        functionRev(n-1);
//        System.out.print(" ");
        System.out.print(n + " ");
    }
}