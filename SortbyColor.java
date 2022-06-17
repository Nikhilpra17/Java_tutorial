package com.company;

import java.util.ArrayList;

public class SortbyColor {
	public static void sortColors(ArrayList<Integer> A) {
        
		int zerocur = 0;
		int onecur = 0;
		int twocur = A.size()-1;
		
		while(onecur <= twocur) {
			if (A.get(onecur) == 0) {
				int temp = A.get(zerocur);
				 A.set(zerocur,A.get(onecur));
				 A.set(onecur, temp);
				zerocur++; onecur++;
			}
			else if (A.get(onecur) == 2) {
				int temp = A.get(onecur);
				 A.set(onecur,A.get(twocur));
				 A.set(twocur, temp);
				twocur--;
			}
			else onecur++;
		}
		System.out.println(A);
	        
	    }
	    
	
    public static void main(String[] args) {

    	ArrayList<Integer> test = new ArrayList<Integer>();
    	
    	test.add(0);
    	test.add(1);
    	test.add(1);
    	test.add(2);
    	test.add(0);
    	test.add(1);
    	test.add(2);
    	test.add(1);
    	test.add(0);
    	
    	sortColors(test);
    }
}
