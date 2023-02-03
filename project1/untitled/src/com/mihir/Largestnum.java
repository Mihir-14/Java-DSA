package com.mihir;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the two Numbers to compare them:");
        Float a = x.nextFloat();
        Float b = x.nextFloat();
        if(a > b){
            System.out.println("The First Number is greater than Second number");

        }else {
            System.out.println("The Second Number is greater than First number");
        }
    }
}
