package com.company;
import java.util.Scanner;

public class signin {
        public static void main(String[] args) {
            String username = "Samantha";
            String password = "Java <3";

        /* Task 1
            1. Pick up a username and password from the user.
       */
            Scanner scan = new Scanner(System.in);
            System.out.println("\nWelcome to Javagram! Sign in below\n");
            System.out.print("• Username: ");
            String user= scan.nextLine();
            //pick up username
            System.out.print("• Password: ");
            String pass= scan.nextLine();
            //pick up password

            while (!user.equals(username) || !pass.equals(password)) {
                System.out.println("Incorrect, Please try again");
                System.out.print("• Username: ");
                user= scan.nextLine();
                System.out.print("• Password: ");
                pass= scan.nextLine();
                System.out.println("Incorrect, Please try again");
            }
            System.out.println("\nSign in successful. Welcome!");

            scan.close();


        }
    }

