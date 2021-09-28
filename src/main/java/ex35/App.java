/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        String str;
        ArrayList<String> names = new ArrayList<String>();
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Enter a name : ");
            str = s.nextLine();
            names.add(str);
        }while(!str.isEmpty());
        names.remove(names.size() - 1);
        System.out.println("The winner is " + names.get(r.nextInt(names.size())));
    }
}