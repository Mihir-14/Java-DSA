package com.Md.strings;
//LC 17
import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad(" " , "12");
//        System.out.println(padReturn(" " , "12"));
//        System.out.println(padReturn(" " , "12").size());
//        System.out.println(padCount(" " , "12"));

    }
    static void pad(String p , String unp){
        if (unp.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit  = unp.charAt(0) - '0'; // converting '2' to 2

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
            char ch = (char)('a' + i );
            pad(p + ch , unp.substring(1));
        }
    }

    static ArrayList<String> padReturn(String p , String unp){
        if (unp.isEmpty()){
            ArrayList<String> lst= new ArrayList<>();
            lst.add(p);
            return lst;
        }

        int digit  = unp.charAt(0) - '0'; // converting '2' to 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
            char ch = (char)('a' + i );
            list.addAll(padReturn(p + ch , unp.substring(1)));
        }
        return list;
    }

    static int padCount(String p , String unp){
        if (unp.isEmpty()){
            return 1;
        }

        int count = 0 ;
        int digit  = unp.charAt(0) - '0'; // converting '2' to 2

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
            char ch = (char)('a' + i );
            count = count + padCount(p + ch , unp.substring(1));
        }
        return count;
    }
}
