package com.Md;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
//        String fruit = x.next();
//        switch (fruit) {
//            case "Apple" -> System.out.println("Keeps the Doctor away");
//            case "Mango" -> System.out.println("Summer season fruit");
//            case "Orange" -> System.out.println("Vitamin D rich fruit");
//            case "Banana" -> System.out.println("increases the stamina");
//            default -> System.out.println("Enter the valid input");
//        }
//        int day = x.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Weeks only contains 7 days");
//        }

        int day = x.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Weeks only contains 7 days");
        }

    }
}