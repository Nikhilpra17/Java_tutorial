package com.company;
import java.util.*;

public class SubArrays {
	
public static void leader(int [] num) {			
		
		for (int i =0; i < num.length; i++ ) {
			for (int e = i; e<num.length; e++) {
				subarray(num , i, e);
			}
		}
	}
	
	public static void subarray(int [] number, int start, int end) {
		for (int i = start; i<=end; i++) {
			System.out.print(number[i]+ " ");
		}
		System.out.println();
		
	}
	
	 public static void main(String[] args) {
	       
	        int [] sum = {1,2,3,4};
	        
	        
	        leader(sum);
	        
	    }
	}
