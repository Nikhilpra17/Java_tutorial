package com.company;

import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the bill");
        int bill = scan.nextInt();

        if (bill > 250) {
            double cost = (50 * 0.5d) + (100 * 0.75d) + (100 * 1.2d) + ((bill - 250) * 1.5d);
            System.out.println(cost);
        } else if (bill <= 250 && bill > 150) {
            double cost = (50 * 0.5d) + (100 * 0.75d) + ((bill - 150) * 1.2d);
            System.out.println(cost);
        } else if (bill <= 150 && bill > 50) {
            double cost = (50 * 0.5d) + ((bill - 50) * 0.75d);
            System.out.println(cost);
        } else {
            double cost = (bill * 0.5d);
            System.out.println(cost);
        }
    }
}
