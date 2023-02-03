package com.mihir;

import java.util.Scanner;

public class Sinterest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the principal amount then Time then Rate of interest : ");
        Float x = num.nextFloat();
        Float y = num.nextFloat();
        Float z = num.nextFloat();
        Float a = x * (1 + ((z/100)*y));
        System.out.println("The Simple interest for the given values is :" +a);
    }
}
