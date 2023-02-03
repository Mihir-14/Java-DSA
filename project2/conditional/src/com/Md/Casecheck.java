package com.Md;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char a = x.next().trim().charAt(0); // .trim removes the extra space & char at return a
                                            // character at a particular index
        if(a >= 'a' && a <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
