package com.mihir;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the amount in ₹:");
        float a = x.nextFloat();
        float b = a/81.34f;
        System.out.println("The amount in $ would be: "+b);
    }
}
