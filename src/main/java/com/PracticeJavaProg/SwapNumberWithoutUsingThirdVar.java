package com.PracticeJavaProg;

public class SwapNumberWithoutUsingThirdVar {

	public static void main(String[] args) {
	
		int x=10,y=20;
		
		x = x+y;
		y = x-y;
		x= x-y;
		
		System.out.println("After swapping a numbers: ");
			
		System.out.println("After swapping x is: "+ x);
		System.out.println("After swapping y is: "+ y);
			
		
		
	}

}
