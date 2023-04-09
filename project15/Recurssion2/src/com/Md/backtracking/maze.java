package com.Md.backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
//        path("" , 3 , 3);
//        System.out.println(pathRet("" ,3 ,3));
//        System.out.println(pathRetDiagonal("" ,3,3));
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathRestriction("" , board , 0 ,0 );
    }

    static int countPath(int row , int col){
        if(row  == 1 || col == 1){
            return 1;
        }
        int left = countPath(row - 1 , col);
        int right = countPath(row , col - 1);
        return left + right;
    }

    static void path (String p , int row ,int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p+'D' , row-1 , col);
        }
        if(col > 1){
            path(p+'R' , row , col-1);
        }
    }


    static ArrayList<String> pathRet(String p , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(pathRet(p+'D' , row-1 , col));
        }
        if(col > 1){
            list.addAll(pathRet(p+'R' , row , col-1));
        }
        return list;
    }


    static ArrayList<String> pathRetDiagonal(String p , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(pathRetDiagonal(p+'D' , row-1 , col-1));
        }
        if(row > 1){
            list.addAll(pathRetDiagonal(p+'V' , row-1 , col));
        }
        if(col > 1){
            list.addAll(pathRetDiagonal(p+'H' , row , col-1));
        }
        return list;
    }


    static void pathRestriction(String p , boolean[][] maze , int row ,int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row < maze.length - 1){
            pathRestriction(p+'D' , maze,row+1 , col);
        }
        if(col < maze[0].length - 1){
            pathRestriction(p+'R' ,maze, row , col+1);
        }
    }
}
