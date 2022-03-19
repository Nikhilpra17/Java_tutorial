package com.company;
import java.util.Scanner;

public class Marks_percent {
    public static void main(String[] args) {
        System.out.println ("Enter the marks in Maths");
        Scanner s1 = new Scanner(System.in);
        int mark1 = s1.nextInt();
        System.out.println ("Enter the marks in English");
        Scanner s2 = new Scanner(System.in);
        int mark2 = s2.nextInt();
        System.out.println ("Enter the marks in Science");
        Scanner s3 = new Scanner(System.in);
        int mark3 = s3.nextInt();
        System.out.println ("Enter the marks in Hindi");
        Scanner s4= new Scanner(System.in);
        int mark4 = s4.nextInt();
        System.out.println ("Enter the marks in Computer Science");
        Scanner s5= new Scanner(System.in);
        int mark5 = s5.nextInt();

        int sum = mark1+mark2+mark3+mark4+mark5;
        float percent = sum/5f ;
        System.out.print("The percentage of person is: ");
        System.out.println(percent);
    }
}
