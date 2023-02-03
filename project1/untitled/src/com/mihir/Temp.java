package com.mihir;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter the Temperature in Celsius: ");
        float Tempc = x.nextFloat();

        float Tempf = (Tempc * 9/5) + 32;
        System.out.println("Temperature in fahrenheit is : " +Tempf);
    }
}
