package com.MD;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+"b");  // ab as the output
        System.out.println('a'+'b');  // ASCII values 195
        System.out.println("a"+"b");  // ab as the output
        System.out.println('a'+3);   // 100
        System.out.println((char) ('a'+3)); // d as the output
        System.out.println("a" + 1); // a1
        System.out.println("M" + new ArrayList<>());  // M[] as the output
        System.out.println("m"+ new Integer(1)); // m1 as the output
    }
}
