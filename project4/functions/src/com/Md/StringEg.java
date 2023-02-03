package com.Md;

public class StringEg {
    public static void main(String[] args) {

        String msg = greeting("Mihir");
        System.out.println(msg);
    }
    static String greeting(String name) {
        String message = "Hi "+name+" How are you whats-upp!!! ";
        return message;
    }
}
