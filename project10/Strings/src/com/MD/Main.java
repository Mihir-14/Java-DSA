package com.MD;

public class Main {
    public static void main(String[] args) {
//        int a =10;
//        int[] b ={1,2,3,4,5};
        String name = "Mihir";   // everything that starts with capital letter is the class
        System.out.println(name);
        String C = "Mihir";
        System.out.println(name == C); // True
        String a = new String("Dudhatra");
        String b = new String("Dudhatra");
        System.out.println(a == b); // False
        System.out.println(a.equals(b)); //True Since this method only compares the value and print the value
    }
}