package com.company;

public class array_highestNumber {
    public static void main(String[] args) {

        int[] number = {random(), random(), random(), random(), random(), random(), random(), random(), random(), random()};

        for (int i= 0; i <number.length ; i++){
            System.out.println(number[i] + " ");
        }

        int highScore = 0;

        for (int g = 0; g < number.length ; g++){
            if (highScore < number[g]){
                highScore = number[g];
            }

        }
        System.out.println("The highest among this array is " + highScore);
            }
        public static int random(){
            double num1 = Math.random()*50000;
            int num2= (int)num1;
            return num2;
        }


    }
