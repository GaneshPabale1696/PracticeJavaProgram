package com.PracticeJavaProg;

public class SwapNumberUsingThirdVar {

	public static void main(String[] args) {
		
		int i=10,j=20;
		
		System.out.println("Before swapping values are :"+ i + " "+j );
		
		//logic 1-Third variable
		int temp = i;
		i = j;
		j= temp;		
		
 
		System.out.println("After swapping values are :"+ i + " "+j );
		
		//Logic 2 -use / and * without using third variable
		
		int  a=10,b=20;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping values are :"+ a + " "+ b );
		
		//logic 3-Single statement
		int k=20,l=30;
		
		l=k+l-(k=l);
		
		System.out.println("After swapping values are :"+ k + " "+ l );
		
	}

}
