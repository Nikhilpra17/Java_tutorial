package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Condtional {
    public static void main(String[] args) {
        System.out.println("Enter the marks obtained");
        Scanner aa= new Scanner(System.in);
        int marks = aa.nextInt();

        if(marks>=70) {
            System.out.println("Congrats!!! You are passed with distinction ");
        }
        else if(marks > 40) {
            System.out.println("You are passed but stay vigilant");
        }
        else{
            System.out.println("Oops, You are failed");
            }
        }
    }

