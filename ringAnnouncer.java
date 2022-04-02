package com.company;
import java.util.Arrays;

public class ringAnnouncer {
    public static void main(String[] args) {

        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS", "win","loss"};

        int win = 0;
        int losses= 0;

        for (int i = 0; i < record.length; i++) {
            if (record[i].toUpperCase().equals("WIN")) {
                win++;
            } else {
                losses++;
            }
        }
        System.out.println(" With a professional record of " + win + " Wins and " + losses + " losses.");

        Arrays.toString(record);

        }
    }

