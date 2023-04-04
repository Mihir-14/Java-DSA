package com.Md.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutation("" , "abc");
//        ArrayList<String> answer = permutationlist("" , "abc");
//        System.out.println(answer);
        System.out.println(permutationCount("" , "abc"));
    }
    static void permutation(String processed , String unProcessd){
        if(unProcessd.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProcessd.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0 ,i);
            String s = processed.substring(i , processed.length());
            permutation(f+ch+s , unProcessd.substring(1));
        }
    }

    static int permutationCount(String processed , String unProcessd){
        if(unProcessd.isEmpty()){
            return 1;
        }
        char ch = unProcessd.charAt(0);
        int count = 0;
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0 ,i);
            String s = processed.substring(i , processed.length());
            count = count + permutationCount(f+ch+s , unProcessd.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutationlist(String processed , String unProcessd){
        if(unProcessd.isEmpty()){
            ArrayList<String> value = new ArrayList<>();
            value.add(processed);
            return value;
        }
        char ch = unProcessd.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0 ,i);
            String s = processed.substring(i , processed.length());
            ans.addAll(permutationlist(f+ch+s , unProcessd.substring(1)));
        }
        return ans;
    }
}
