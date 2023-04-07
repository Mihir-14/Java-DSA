package com.Md.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("" , 4);
        System.out.println(diceReturn(" " , 4));

    }
    static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i , target - i);
        }
    }

    static ArrayList<String> diceReturn(String p , int target){
        if(target == 0){
            ArrayList<String> lst= new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String> list =new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p+i , target - i));
        }
        return list;
    }


    static void diceFace(String p , int target , int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i , target - i , face);
        }
    }


    static ArrayList<String> diceFaceReturn(String p , int target , int face){
        if(target == 0){
            ArrayList<String> lst= new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String> list =new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceReturn(p+i , target - i , face));
        }
        return list;
    }
}
