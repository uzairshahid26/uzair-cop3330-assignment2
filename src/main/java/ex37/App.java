/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex37;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //list for special characters
        List<Character> special = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        Random random = new Random();
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        //Numbers
        String nums = "0123456789";
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        List<Character> numbers = new ArrayList<>();
        for(char ch: nums.toCharArray()){
            numbers.add(ch);
        }
        //Alphabets
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Character> alphabets = new ArrayList<>();
        for(char ch: letters.toCharArray()){
            alphabets.add(ch);
        }
        //Taking values
        System.out.print("What's the minimum length? ");
        int n = scanner.nextInt();
        System.out.print("How many special characters? ");
        int specialCount = scanner.nextInt();
        System.out.print("How many numbers? ");
        int numCount = scanner.nextInt();

        //Generating the password
        StringBuilder password = new StringBuilder();
        //Adding random alphabets
        for(int i=0;i<n-specialCount-numCount;i++){
            password.append(alphabets.get(random.nextInt(alphabets.size())));
        }
        //Adding random special characters
        for(int i=0;i<specialCount;i++){
            password.append(special.get(random.nextInt(special.size())));
        }
        //Adding random numbers
        for(int i=0;i<numCount;i++){
            password.append(numbers.get(random.nextInt(numbers.size())));
        }
        //Mixing the generated password
        char[] arr = password.toString().toCharArray();
        for(int i=arr.length-1;i>0;i--){
            int j = random.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new StringBuilder(new String(arr));
        //Printing password
        System.out.println("Your password is "+password);
    }
}


