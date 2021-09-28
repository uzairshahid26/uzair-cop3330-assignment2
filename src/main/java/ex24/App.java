/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;


public class App {
    static boolean isAnagram(String word1, String word2) {
        String s1 = word1.replaceAll("\\s", "");
        String s2 = word2.replaceAll("\\s", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();
        if (isAnagram(word1, word2))
            System.out.print("\"" + word1 + "\"" + " and " + "\"" + word2 + "\"" + " are anagrams.");
        else
            System.out.print("\"" + word1 + "\"" + " and " + "\"" + word2 + "\"" + " are not anagrams.");


    }
}



