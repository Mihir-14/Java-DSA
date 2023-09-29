package com.collection;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List<Integer> List2 = new LinkedList<>();
        List2.add(34);
        List2.add(45);
        List2.add(68);
        List2.add(14);
        System.out.println(List2);
        List<Integer> vect = new Vector<>();
        vect.add(28);
        vect.add(23);
        vect.add(14);
        System.out.println(vect);
    }
}
