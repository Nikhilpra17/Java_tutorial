package com.company;

import java.util.HashMap;

public class freqHashmap {
	public static void frequency(int [] arr) {
	       HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	       
	       for (int i=0; i< arr.length; i++) {
	    	   if (hm.containsKey(arr[i])) {
	    		   hm.put(arr[i], hm.get(arr[i]) + 1 );
	    	   } else {
	    		   hm.put(arr[i], 1);
	    	   }
	       }
	   
	        System.out.println(hm);
	    }
		  
	    public static void main(String[] args) {
	    	int [] array = {2,6,3,8,2,8,2,3,8,10};
	    	
	    	frequency(array);

	    }
	}
