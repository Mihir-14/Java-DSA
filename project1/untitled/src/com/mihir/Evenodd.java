package com.mihir;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number of your choice:");
        int x = num.nextInt();
        if(x % 2 ==0){
            System.out.println("The given number is Even number");
        }
        else {
            System.out.println("The given number is Odd number");
        }
    }
}
