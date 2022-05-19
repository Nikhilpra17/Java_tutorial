package com.company;

import java.util.Arrays;

public class swapingTheArray {

public static void swap(int [] array) {
		
		int i = 0;
		int j = array.length-1;
		while (i<j) {
			int temp =0;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(array));
		
	}
	
    public static void main(String[] args) {
        
    	int [] integ = {3,-2,1,4,3,6,8};
    	
    	
    	swap(integ);


    }
}
