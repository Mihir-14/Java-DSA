package com.Md.strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        sequence("" ,"ABC" );
//        System.out.println(sequence1("" , "ABC"));
//        sequenceAscii("" ,"ABC" );
        System.out.println(sequence1Ascii("" , "abc"));
    }
    static void sequence(String proc , String unProc){
        if (unProc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unProc.charAt(0);

        sequence(proc , unProc.substring(1)); // leave it
        sequence(proc + ch ,unProc.substring(1)); // Take it
    }



//    Returning in arraylist
    static ArrayList<String> sequence1(String proc , String unProc){
        if (unProc.isEmpty()){
            ArrayList<String> lst= new ArrayList<>();
            lst.add(proc);
            return lst;
        }
        char ch = unProc.charAt(0);

        ArrayList<String> left =sequence1(proc + ch ,unProc.substring(1)); // Take it
        ArrayList<String> right =sequence1(proc , unProc.substring(1)); // leave it

        left.addAll(right);
        return left; // here we can return any of the array left/right
//                      since it is added in the same array only
    }


    static void sequenceAscii(String proc , String unProc){
        if (unProc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unProc.charAt(0);

        sequenceAscii(proc + ch ,unProc.substring(1)); // Take it
        sequenceAscii(proc , unProc.substring(1)); // leave it
        sequenceAscii(proc + (ch+0) ,unProc.substring(1));
    }


    static ArrayList<String> sequence1Ascii(String proc , String unProc){
        if (unProc.isEmpty()){
            ArrayList<String> lst= new ArrayList<>();
            lst.add(proc);
            return lst;
        }
        char ch = unProc.charAt(0);

        ArrayList<String> first =sequence1Ascii(proc + ch ,unProc.substring(1)); // Take it
        ArrayList<String> second =sequence1Ascii(proc , unProc.substring(1)); // leave it
        ArrayList<String> third =sequence1Ascii(proc + (ch+0) , unProc.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
