package com.company;

import java.util.Arrays;

public class reverseTheArray {

	public static void reverse(int [] array) {
		int [] reversearray = new int[array.length];
		
		for (int i =0; i<array.length; i++) {
			reversearray[i] = array[(array.length-1) - i]; 
		}
		
		System.out.println(Arrays.toString(reversearray));
		
	}
	
    public static void main(String[] args) {
        
    	int [] integ = {3,-2,1,4,3,6,8};
    	
    	
    	reverse(integ);


    }
}
