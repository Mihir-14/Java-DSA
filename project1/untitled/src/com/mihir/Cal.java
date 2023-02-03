package com.mihir;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        System.out.println("Enter the First number and Second number");
        float num1 = num.nextInt();
        float num2 = num.nextInt();
        System.out.println("Enter the operations to be performed *,/,+,-");
        char x = num.next().charAt(0);
        if(x == '*'){
            System.out.println("The Mul is :" +(num1 * num2));
        } else if (x == '/') {
            System.out.println("The Div is :" +(num1 / num2));
        }else if (x == '+') {
            System.out.println("The Add is :" +(num1 + num2));
        }else if (x == '-') {
            System.out.println("The Sub is :" +(num1 - num2));
        }
    }
}
