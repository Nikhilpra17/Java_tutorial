package com.company;
import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner ot = new Scanner(System.in);
        int a = ot.nextInt();
        System.out.println("Enter the second number");
        int b = ot.nextInt();
        int sum = a + b ;
        System.out.print("The sum of two entered number is: ");
        System.out.println(sum);
}
}