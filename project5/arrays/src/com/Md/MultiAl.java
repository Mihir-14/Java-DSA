package com.Md;

import java.util.ArrayList;
import java.util.Scanner;

//Multi Dimensional array list (i.e Multi dimensional dynamic arrays)
public class MultiAl {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr  = new ArrayList<>();
//        Initialisation
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
//        Adding all elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(x.nextInt());
            }
        }
        System.out.println(arr);
    }
}
