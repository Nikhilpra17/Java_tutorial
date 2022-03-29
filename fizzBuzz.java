package com.company;

public class fizzBuzz {
        public static void main(String[] args) {

            // Task 1 – Make a for loop that counts from 0 to 18.

            for (int i = 0; i <=18; i++){
                if (i%3 == 0 && i%5==0 ){
                    System.out.println( i + " FizzBuzz");
                }else if (i%3==0){
                    System.out.println(i + " Fizz");
                }else if (i%5 ==0){
                    System.out.println(i + " Buzz");
                }

        }

    }
}
