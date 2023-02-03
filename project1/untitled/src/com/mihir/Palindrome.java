package com.mihir;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int a = x.nextInt();
        System.out.println("Enter the end number:");
        int b = x.nextInt();
        for(int i=a ; i < b ; i++){
            int check , mod , sum = 0;
            check = i;
            while(check != 0){
                mod = check%10;
                sum = sum + (mod * mod * mod);
                check = check /10;
            }
            if(sum == i){
                System.out.println("The armstrong numbers are: " +i);
            }
        }
    }
}
