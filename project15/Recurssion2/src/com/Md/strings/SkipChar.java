package com.Md.strings;

public class SkipChar {
    public static void main(String[] args) {
//        String ans = skip1("baccd");
//        String ans = skipApple("baccaappled");
        String ans = skipAppNotApple("baccappled");
        System.out.println(ans);
    }
    static void skip(String s , String unpr){
        if(unpr.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = unpr.charAt(0);
        if(ch == 'a'){
            skip(s , unpr.substring(1));
        }else {
            skip(s+ch,unpr.substring(1) );
        }
    }

//Returning the String
    static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip1(str.substring(1));
        }else {
            return ch + skip1(str.substring(1) );
        }
    }

//    If we want to skip a string
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }


        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return str.charAt(0) + skipApple(str.substring(1) );
        }
    }

    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }


        if(str.startsWith("app") && !str.startsWith("Apple")){
            return skipAppNotApple(str.substring(3));
        }else {
            return str.charAt(0) + skipAppNotApple(str.substring(1) );
        }
    }
}
