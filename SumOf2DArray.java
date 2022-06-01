package com.company;

public class SumOf2DArray {
	public static void sum (int [][] matrix) {
		for (int i =0; i<matrix.length; i++) {
			int sum =0;
			for (int p = 0; p<matrix[0].length; p++) {
			sum += matrix[i][p];
		}
			System.out.println("Sum of " + i + "th row : " + sum);
		}
	}
	 public static void main(String[] args) {
	       
	        int[][] a = { {3,8,9,2}, {1,2,3,6}, {4,10,11,17} };
	        
	        sum(a);
//	        System.out.println((char) (i + 32));
	        
	   
	        
	    }
	
}
