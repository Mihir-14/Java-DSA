package com.MD;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Factors3(30);
    }
//    O(n)
    static void Factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
//    O(sqrt(n))
    static void Factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    static void Factors3(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    a.add(n/i);
                }
            }
        }
        for (int i = a.size()-1; i >= 0; i--) {
            System.out.print(a.get(i) + " ");
        }
    }
}
