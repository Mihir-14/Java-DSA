package com.MD;
//1672
//https://leetcode.com/problems/richest-customer-wealth/
public class Leetcode2 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
//        row = person
//        col = Accounts
        int ans =Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum =0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if(sum > ans){
                ans =sum;
            }
        }
        return ans;
    }
}
