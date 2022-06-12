package com.company;
import java.util.*;

public class KadaneAlgo {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	   public int maxSubArray(final List<Integer> A) {
	          int maxsoend =0;
	        int maxsofar = 0;
	        int valueofarray = -1;

	        for (int i =0; i<A.size(); i++) {
	    		if (A.get(i)>= 0) {
	    			valueofarray = 1;
	    			break;
	    		} 
	        }


	    
	        if (valueofarray == -1){
	    			Collections.sort(A);
	    			maxsofar = A.get(A.size()-1);
	    		}

	        
	    if (valueofarray == 1){
	        if (A.size() == 1){
	            maxsofar = A.get(0);
	        }
	        else{
	        
	        for (int i =0; i< A.size(); i++) {
	            maxsoend += A.get(i);
	            if (maxsoend <0) {
	                maxsoend = 0;
	            }
	            if (maxsoend > maxsofar) {
	                maxsofar = maxsoend;
	            }
	        }
	        }
	    }
	        return maxsofar;
	    }
	    }


}
