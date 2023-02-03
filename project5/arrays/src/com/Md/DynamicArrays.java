package com.Md;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
//        x.add(10);
//        x.add(20);
//        x.add(30);
//        x.add(40);
//        x.add(50);
//        x.add(60);
//        x.add(70);
//        x.add(80);
//        x.add(90);
//        x.add(100);
//        x.add(110);
//        x.add(120);
//        x.add(130);
//        x.set(0,69);
//        x.remove(0);
//        System.out.println(x);
        for (int i = 0; i < 100; i++) {
            x.add(a.nextInt());
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(x.get(i) + " ");
        }
    }
}
