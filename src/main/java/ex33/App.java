/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //storing possible responses in array
        String[] responses = {"Yes","No","Maybe","Ask again later"};
        //Create random object
        Random random = new Random();

        //create Scanner instance to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your question? ");
        String question = scanner.nextLine();//get the question

        //It will choose any index >= 0 and less than responses.length
        int randomResponseIndex = random.nextInt(responses.length);
        //get the random index from the array
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);//print the response
        System.out.println();
    }
}
