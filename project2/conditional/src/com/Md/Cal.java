package com.Md;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the operator of your choice");
            char operator =  in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' ||operator == '%'){
                System.out.println("Enter the two Numbers:");
                int x = in.nextInt();
                int y = in.nextInt();
                if(operator == '+'){
                    ans = x + y;
                }else if (operator == '-'){
                    ans = x - y;
                }else if (operator == '*'){
                    ans = x * y;
                }else if (operator == '/'){
                    if(y > 0){
                        ans = x / y;
                    }
                }else if (operator == '%'){
                    ans = x % y;
                }
            } else if (operator == 'X'|| operator == 'x') {
                break;
            }else {
                System.out.println("Invalid Value Entered");
            }
            System.out.println(ans);
        }
    }
}
