package com.company;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {

        // PROBLEM 1
//            System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
//            String[] names = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
//            System.out.println(names[0] + "will take take seat at o index\n");
//            System.out.println(names[1] + "will take take seat at 1 index\n");
//            System.out.println(names[2] + "will take take seat at 2 index\n");
//            System.out.println(names[3] + "will take take seat at 3 index\n");
//            System.out.println(names[4] + "will take take seat at 4 index\n");

        //Task 1: Create an array that stores 5 students: "Harry", "Neville", "Ron", "Hermione", "Seamus"

        //Task 2: Assign each student a seat according to their index in the array.
        //           print: " <student at index 0> ", you will take seat 0.

        //PROBLEM 2

//        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
//        String[] name = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
//
//        for (int i = 0; i < name.length; i++) {
//            System.out.println("The seat with index of " + i + " is assigned to " + name[i]);
//        }

        // PROBLEM 3

//        String[] stuffs= {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
//
//        for (int i = 0; i<stuffs.length; i++){
//            System.out.println(stuffs[i]);
//            if (stuffs.equals("coffee")){
//                System.out.println("\n We have that in aisle");
//                break;
//            }
//        }

        //PROBLEM 4

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        Scanner scan = new Scanner(System.in);
        String new1 = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(new1)) {
                System.out.println("\n We have that in aisle " + i);
                break;
            }
        }
    }
}