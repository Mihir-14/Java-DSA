package com.MD;

public class Peformance {
    public static void main(String[] args) {
//        String a = ""; // empty string
//        for (int i = 0; i < 26; i++) {
//            char c = (char)('a' + i);
//            System.out.println(c); // a b c d e f g h i j k l m n o p q r s t u v w x y z
////            This type of example is creating the new object not editing the old object and this increase
////            in time complexity O(N^2)
//            a = a + c;
//        }
//        System.out.println(a); // abcdefghijklmnopqrstuvwxyz
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c =(char)('a' + i);
            a.append(c);
//          This is not creating a new object but is is changing the original  object
        }
        System.out.println(a.toString()); // abcdefghijklmnopqrstuvwxyz
    }
}
