package com.Md;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int EmpId = x.nextInt();
        String depart = x.next();
        switch (EmpId){
            case 1:
                System.out.println("Mihir");
                break;
            case 2:
                System.out.println("Dudhatra");
                break;
            case 3 :
                System.out.println("Emp id 3");
                switch (depart){
                    case "Committee":
                        System.out.println("Committee member");
                        break;
                    case "Management":
                        System.out.println("Management member");
                        break;
                    default:
                        System.out.println("Invalid department");
                }
                break;
            default:
                System.out.println("Enter valid emp Id & Depatment");
        }


        switch (EmpId) {
            case 1 -> System.out.println("Mihir");
            case 2 -> System.out.println("Dudhatra");
            case 3 -> {
                System.out.println("Emp id 3");
                switch (depart) {
                    case "Committee" -> System.out.println("Committee member");
                    case "Management" -> System.out.println("Management member");
                    default -> System.out.println("Invalid department");
                }
            }
            default -> System.out.println("Enter valid emp Id & Depatment");
        }
    }
}
