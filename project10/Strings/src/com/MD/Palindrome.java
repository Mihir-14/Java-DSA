package com.MD;

public class Palindrome {
    public static void main(String[] args) {
        String a = "";
        System.out.println(isPlaindrome(a));
    }
    static boolean isPlaindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
