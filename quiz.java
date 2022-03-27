package com.company;
import java.util.Scanner;

public class quiz {

        public static void main(String[] args) {

            int score = 0;
            Scanner scan = new Scanner(System.in);

            System.out.println("1. Which country held the 2016 Summer Olympics?");
            System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
            //store answer 1
            String ans1 = scan.nextLine();
            if (ans1.equals("a")) {
                System.out.println("Hurrey .......You got it RIGHT");
                score += 5;
            } else {
                System.out.println("Opps .......You got it WRONG ");
            }

            System.out.println("\n2. Which planet is the hottest?");
            System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
            //store answer 2
            String ans2 = scan.nextLine();
            if (ans2.equals("b")) {
                System.out.println("Hurrey .......You got it RIGHT");
                score += 5;
            } else {
                System.out.println("Opps .......You got it WRONG ");
            }

            System.out.println("\n3. What is the rarest blood type?");
            System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
            //store answer 3
            String ans3 = scan.nextLine();
            if (ans3.equals("c")) {
                System.out.println("Hurrey .......You got it RIGHT");
                score += 5;
            } else {
                System.out.println("Opps .......You got it WRONG ");
            }

            System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
            System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n\td) Both a and b");
            //store answer 4
            String ans4 = scan.nextLine();
            if (ans4.equals("d")) {
                System.out.println("Hurrey .......You got it RIGHT");
                score += 5;
            } else {
                System.out.println("Opps .......You got it WRONG ");
            }


            //Task 2: Check each answer - For each correct answer, add 5 points to the score.

            System.out.println("Your final score is: " + score + "/20");
            if (score >= 15) {
                System.out.println("Wow, You know your stuff");
            } else if (score >= 5 && score < 15) {
                System.out.println("Not Bad");
            }else{
                System.out.println("Better luck next time");

            //Task 3: print a message depending on the score

            // if the score is 15 or higher, print: "Wow, you know your stuff!";
            // if the score is between 5 and 15, print "Not bad!";
            // else, better luck next time.


            scan.close();

        }
    }
}
