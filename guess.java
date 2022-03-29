package com.company;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);


        /* Task 2
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '
            2. Once they guess it, print: You got it!
        */
        scan.close();
    }


    public static int random(){
        double num = Math.random()*5;
        int num2 = (int)num;
        int num3 = num2+1;
        return num3;
    }

}