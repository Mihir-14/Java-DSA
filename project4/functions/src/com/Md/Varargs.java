package com.Md;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
//        function(1,2,3,4,5,5,6,7,8,8,9,9,1,0);
//        function();
        fun(69);
        fun(3,5);



//        Function overloading means two or more function has same name and thus we cannot use them
//        but we can use the function with same name if and only if we have arguments with different types
//        either the number of arguments should be different or the type of arguments should be different
//        eg: fun(int a);
//        fun(string name);

    }
    static void fun(int p){
        System.out.println(p);
    }
    static void fun(int q,int r){
        System.out.println(q+r);
    }
    static void mul(int x ,int y , String ...z){   // variable length arguments should always be at last in arguments

    }
    static void function(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
