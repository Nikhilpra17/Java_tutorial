package com.company;

public class Missingterm {
	public static void missingNumber(int[] intArray) {
        int missingnumber = 0;
        int difference = 0;
        for (int i =0 ; i< intArray.length-2; i++){
            if ((intArray[i+1] - intArray[i]) == (intArray[i+2] - intArray[i+1])){
                difference = intArray[i+1] - intArray[i];
                break;
            }
        }
        for (int i =0 ; i< intArray.length-1; i++){
            if (intArray[i] + difference != intArray[i+1]){
                missingnumber = intArray[i] + difference;
                break;
            }
            
        }
        System.out.println(missingnumber);
    }
	
	
	public static void main(String[] args) {
	
		int[] intArray = {1,2,3,4,5,6,8,9,10};
		
		missingNumber(intArray);
		
	    }
	}
