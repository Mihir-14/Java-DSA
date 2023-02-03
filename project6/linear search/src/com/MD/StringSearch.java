package com.MD;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name ="Mihir";
        char t = 'z';
//        System.out.println(search2(name,t));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static  boolean search(String st,char target){
        if (st.length()==0){
            return false;
        }
        for (int i = 0; i < st.length(); i++) {
            if(target == st.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static  boolean search2(String st,char target){
        if (st.length()==0){
            return false;
        }
        for (char c :st.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
