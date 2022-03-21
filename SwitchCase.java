package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        int age = aa.nextInt();
        switch(age){
            case 18: System.out.println("Welcome to world of pressure");
                    break;
            case 22: System.out.println("Out of your college");
                    break;
            case 28:
                System.out.println("Get the career sorted");
                break;
            default:
                System.out.println("Not to bother");


        }
    }
}
