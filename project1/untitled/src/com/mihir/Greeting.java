package com.mihir;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Name of the Person:");
        String x = n.next();
        System.out.println("HEY " +x+ " How are you whats-upp");
    }
}
