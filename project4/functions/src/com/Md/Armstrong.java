package com.Md;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
//        int n = x.nextInt();
//        System.out.println(iSsArm(n));
        for (int i = 100; i <= 999 ; i++) {
            if(isArm(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArm(int n) {
        int org = n;
        int sum =0;
        while (n > 0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;

        }
        return sum == org;
    }

}
