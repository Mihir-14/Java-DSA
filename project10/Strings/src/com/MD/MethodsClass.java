package com.MD;

import java.util.Arrays;

public class MethodsClass {
    public static void main(String[] args) {
        String name = "Mihir Dudhatra";
        System.out.println(Arrays.toString(name.toCharArray())); // [M, i, h, i, r,  , D, u, d, h, a, t, r, a]
        System.out.println(name.indexOf('D')); // 6

    }
}
