package com.company;
import java.math.*;

public class rollingdice {
    public static void main(String[] args) {

        int dice1 = randomroll();
        int dice2 = randomroll();
        int dice3 = randomroll();
        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(dice3);

        int sum = dice1 + dice2 + dice3;
        System.out.println("THe sum : " + sum);

        if (sum == 12){
            int dice11 = randomroll();
            int dice22 = randomroll();
            int dice33 = randomroll();
            System.out.println(dice11);
            System.out.println(dice22);
            System.out.println(dice33);
            int difference1 = Math.abs((dice11-dice22));
            int difference2 = Math.abs((dice11-dice33));
            int difference3 = Math.abs((dice33-dice22));

            if ((dice11+dice22+dice33)<sum && (difference1 < 3 || difference2 <3 || difference3<3)){
                System.out.println("you win");
            }
        }



    }
      public static int randomroll() {
          double roll = Math.random()*6;
          roll += 1;
          return (int)roll;
        }


    }

