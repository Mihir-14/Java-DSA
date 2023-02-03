package com.Md;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = mul();
        System.out.println(a);
    }
    //returns the value
    static int mul(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number 1:");
        int num1 = x.nextInt();
        System.out.print("Enter the Number 2:");
        int num2 = x.nextInt();
        int mul = num1 * num2;
        return mul;
    }
    // void means it does not returns the value 
    static void sum(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number 1:");
        int num1 = x.nextInt();
        System.out.print("Enter the Number 2:");
        int num2 = x.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:"+sum);
    }
}