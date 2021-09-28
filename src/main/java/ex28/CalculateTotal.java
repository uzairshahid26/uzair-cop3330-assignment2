/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex28;

import java.util.Scanner;


public class CalculateTotal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int total = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter a number: ");
                total += scanner.nextInt();
            }
            System.out.println("The total is " + total + ".");
        }
    }

