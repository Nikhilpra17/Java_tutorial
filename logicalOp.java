package com.company;
//Temp forecast
public class logicalOp {
    public static void main(String[] args) {

        int temp = -5;

        String forecast = "";

        if (temp>-15 && temp<-1) {
            System.out.println(" The forecast is Freezing! Stay home!");
        }
        else if (temp>0 && temp<10) {
            System.out.println("The forecast is chilly. Wear a coat!");
        }
        else {
            System.out.println("Its warm. go outside");
        }
        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!

        System.out.println(forecast);
    }
}

