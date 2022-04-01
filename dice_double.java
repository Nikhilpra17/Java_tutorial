package com.company;

public class dice_double {
        public static void main(String[] args) {

            int dice1 = roll();
            int dice2 = roll();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");

        /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values.
         */
            while (dice1 != dice2 ){
                dice1 = roll();
                dice2 = roll();

                System.out.println("Dice 1: " + dice1);
                System.out.println("Dice 2: " + dice2 + "\n");
            }


            // Task 4: After they roll doubles, print: You rolled doubles!
        }


        /** Task 1
         * Function name: rollDice – rolls a dice between 1 and 6
         * @return randomNumber (int)
         *
         */
        public static int roll(){
            double num = Math.random()*6;
            int num1 = (int)num + 1;
            return num1;



    }
}
