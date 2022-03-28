package com.company;
import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        char c1 = a1.next().charAt(0);

//        if (c1 =='a' || c1 =='e' || c1=='i' || c1=='o' || c1=='u'){
//            System.out.println("Eneterd alphabet is vowel");
//        }
//        else{
//            System.out.println("Entered Alphabet is Consonant");
//        }

        //SWITCH CASE
        switch (c1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered value is vowel");
                break;
            default:
                System.out.println("Entered the value is consonant");


        }
    }
}