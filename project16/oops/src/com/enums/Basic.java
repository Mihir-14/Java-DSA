package com.enums;

public class Basic {
    enum Week{
        Mon,Tue,Wed,Thur,Fri,Sat,Sun
        // these are the enum constants
        // public static and final
        // since its final you can create child enums
        // can implement as many interfaces as we want cannot extends classes etc.
    }

    public static void main(String[] args) {
        Week abc;
        abc = Week.Mon;
        System.out.println(abc);
        System.out.println(abc.ordinal());
        for(Week days : Week.values()){
            System.out.println(days);
        }
    }
}
