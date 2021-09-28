/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex31;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float rate;
        try {
            System.out.print("Enter your Age : ");
            int age = scanner.nextInt();
            System.out.print("Enter your resting heart rate : ");
            float heart_rate = scanner.nextFloat();
            System.out.println("\nResting Pulse : " + heart_rate + "      Age : " + age);
            System.out.println("Intensity   | Rate");
            System.out.println("------------|----------");
            for (int i = 55; i <= 95; i += 5) {
                rate = (((220 - age) - heart_rate) * i / 100) + heart_rate;
                System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
            }
        } catch (Exception e) {
            System.out.println("Enter only numbers please.");
        }
    }
}
