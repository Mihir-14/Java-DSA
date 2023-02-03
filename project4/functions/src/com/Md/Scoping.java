package com.Md;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 35;
        System.out.println(b);
        {
            System.out.println(a);
//            int a = 69  //if initialise outside we can change the value again but cannot re initialise it again
             b = 3;
             int z = 20;
            System.out.println(b); //Values that are initialise in this block will remain in this block only
            System.out.println(z);
        }
        int z =20;
        System.out.println(b);
        System.out.println(z);
    }
}
