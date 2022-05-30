package com.company;

public class CarryForwardApproach {

public static int pair(char [] number) {			
		
		int count = 0;
		int gss = 0;
		int ass =0;
		
		for (int i = number.length-1; i>=0 ; i--) {
			if (number[i] == 'g') {
				gss ++;
			}
			if (number[i] == 'a') {
				ass = gss;
				count += ass;
			}
		}
		
			
			return count;
	}
	
	 public static void main(String[] args) {
	       
	        char [] sum = {'a','d','g','a','g','a','g','f','g'};
	        
	        
	        int popo = pair(sum);
	        
	        System.out.println(popo);
	    }
	
}
