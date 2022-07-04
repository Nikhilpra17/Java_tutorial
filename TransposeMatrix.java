package com.company;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println(" Enter the rows of Matrix");
    	int row = scan.nextInt();
    	
    	System.out.println("Enter the columns of Matrix ");
    	int column = scan.nextInt();
    	
    	// first matrix
    	int[][] neww = new int[row][column];
    	
    	for (int i =0; i < row ; i++) {
    		for (int j =0; j < column; j++) {
    			neww[i][j] = scan.nextInt();
    			
    		}
    	}
    	
    	
//    	// Second matrix
//    	int[][] eww = new int[row][column];
//    	
//    	for (int i =0; i < row ; i++) {
//    		for (int j =0; j < column; j++) {
//    			eww[i][j] = scan.nextInt();
//    			
//    		}
//    	}
    	
    	// Resultant Array
    	int[][] ww = new int[column][row];
    	
    	for (int i =0; i < column ; i++) {
    		for (int j =0; j < row; j++) {
    			ww[i][j] = neww[j][i];
    			
    		}
    	}
    	
    	// Print Array
    	for (int i =0; i < row ; i++) {
    		for (int j =0; j < column; j++) {
    			System.out.print(ww[i][j] + " ");
    		}
    		System.out.println();
    	
    }
}
}
