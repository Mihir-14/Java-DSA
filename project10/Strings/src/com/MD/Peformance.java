package com.MD;

public class Peformance {
    public static void main(String[] args) {
        String a = ""; // empty string
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            System.out.println(c); // a b c d e f g h i j k l m n o p q r s t u v w x y z
            a = a + c;
        }
        System.out.println(a); // abcdefghijklmnopqrstuvwxyz
    }
}
