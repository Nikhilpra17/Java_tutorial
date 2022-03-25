package com.company;
import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int number1 = aa.nextInt();
        System.out.println("Enter the Name: ");
        String s1 = aa.next();
        System.out.println("Your name is "+ s1+ " and your age is "+ number1);
    }
}
