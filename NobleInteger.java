package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
	 public static int solve(ArrayList<Integer> A) {
	        Collections.sort(A);
	        int length = A.size()-1;
	        int result = -1;
	        
	        for (int i =0; i<A.size() -1 ; i++){
	            int difference = length - i;
	            if (A.get(i) == A.get(i+1)){
	            	continue;
	            }
	            else if (A.get(i) == difference){
	                result = 1;
	                break;
	            } 
	            }
	        if (A.get(length) == 0) {
	        	result = 1;
	        }

	        return result;

	        

	    }
	    
	
 public static void main(String[] args) {

	ArrayList<Integer> test = new ArrayList<Integer>();
	
	test.add(1);
//	test.add(2);
	test.add(3);
	test.add(4);
	test.add(1);
//	test.add(2);
	test.add(1);
	test.add(0);

	long pop = solve(test);
	
	System.out.println(pop);
	
 }
}

