package com.company;
import java.util.Scanner;

public class passpercent {
    public static void main(String[] args) {
        System.out.println("Enter the marks obtain in Maths");
        Scanner sc= new Scanner(System.in);
        int ma= sc.nextInt();
        System.out.println("Enter the marks obtain in English");
        int eng= sc.nextInt();
        System.out.println("Enter the marks obtain in Science");
        int sci= sc.nextInt();
        float percent = (ma+eng+sci)/3f;
        System.out.println(" The percentage obtained by the student is "+ percent+ "%");
        if(ma<33 && eng <33 && sci<33 ){
            System.out.println("Fail to clear the subject cutoff");
        }
        else{
            if (percent>40){
                System.out.println("Congrats!!!! you are pass");
            }
            else{
                System.out.println("Fail to clear the overall cutoff");
            }
        }


    }
}
