/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Create an arrayList of employees
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees);//print the employees

        Scanner sc = new Scanner(System.in);//create scanner instance to read user input

        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        String nameToRemove = sc.nextLine();//get emp name to remove

        employees.remove(nameToRemove);//remove the employee from the array list

        System.out.println();
        printEmployees(employees);//print employees
    }
    //print
    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}

