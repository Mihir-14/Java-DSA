package com.mihir;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number of your choice:");
        int a = x.nextInt();
        int b = 2;
        while (b*b < a){
            if (a % b == 0){
                System.out.println("The given number is not the Prime Number or It is a Composite number");
                break;
            }
            else {
                b++;
            }
            System.out.println("THe given number is the Prime number");
        }
    }
}
