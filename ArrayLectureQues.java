package com.company;
import java.util.*;

public class ArrayLectureQues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature of number of days");
		int days = scan.nextInt();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		System.out.println("Enter the temperature of each day");
		for (int i =0; i < days; i++){
			temp.add(i, scan.nextInt());
		}
		int average = 0 ;
		for (int i =0; i < temp.size(); i++) {
			average += temp.get(i);
		}
		average = average / temp.size();
		
		int count = 0;
		
		for (int i =0; i <temp.size(); i++) {
			if (temp.get(i) > average) {
				count ++;
			}	
		}
		
		System.out.println("The temperature of " + count + " days are above the average temp which is " + average);
		
	}

}
