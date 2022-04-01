package com.company;
import java.util.Scanner;

public class java_rolls {

    public static int random() {
        double dice = Math.random() * 6;
        int dice1 = (int) dice + 1;
        return dice1;
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Let's play Rolling Java. Type anything to start.");
            scan.nextLine();

            System.out.println(" Great, here are the rules:\n" +
                    "- If you roll a 6 the game stops.\n" +
                    "- If you roll a 4 nothing happens.\n" +
            "- Otherwise, you get 1 point.\n");

            System.out.println("\nLet's play Rolling Java. Type anything to start");
            scan.nextLine();


            int score = 0;

            while (true) {
                System.out.println("\nYou rolled the dice");
                int diceroll = random();
                System.out.println(diceroll);

                if (diceroll == 6){
                    System.out.println("End of the game");
                break;
                } else if (diceroll == 4) {
                    System.out.println("Zero points, keep rolling");
                } else {
                    System.out.println("One point. Keep rolling");
                    score++;
                }
            }
            System.out.println("End of Game");
            System.out.println(score);
            if (score>=3){
                System.out.println("You win");
            }else{
                System.out.println("You lose");
            }

        }


    }

