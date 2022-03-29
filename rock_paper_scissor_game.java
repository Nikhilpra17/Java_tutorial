package com.company;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        System.out.println("*********  Enter to the game of Rock, Paper and Scissor  ********* ");

        System.out.println("Your Turn: Select anyone among the following: ");
        System.out.println("1) Rock \n2) Paper\n3) Scissor");
        Scanner scan = new Scanner(System.in);
        int input= scan.nextInt();

        System.out.println("Computer's Turn: Select anyone among the following: ");
        double random = Math.random()*2;
        random +=1;
        int comp = (int)random;
        System.out.println(comp);

        if (input==1 && comp ==1 ){
            System.out.println("Draw");
        }else if (input==1 && comp ==2 ){
            System.out.println("Computer Wins");
        }else if (input==1 && comp ==3 ){
            System.out.println("You Wins");
        }else if (input==2 && comp ==1 ){
            System.out.println("You Wins");
        }else if (input==2 && comp ==2 ){
            System.out.println("Draw");
        }else if (input==2 && comp ==3 ){
            System.out.println("Computer Wins");
        }else if (input==3 && comp ==1 ){
            System.out.println("Computer Wins");
        }else if (input==3 && comp ==2 ){
            System.out.println("You Wins");
        }else if (input==3 && comp ==3 ) {
            System.out.println("Draw");
        }




    }
}
