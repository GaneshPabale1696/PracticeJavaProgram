package com.PracticeJavaProg;

public class FibinacciSeriesWithRecursion {

	public static void main(String[] args) {
		
		fibinacciNumber(10);	
	}

	
	public static int fibinacciNumber(int n)
	{
		int a=0,b=1,sum=0;
		
		System.out.print(a+" "+b);
		
		for(int i=2;i<=n;i++) {
			
			sum=a+b;
			
			System.out.print(" "+sum);
			
			a=b;
			b=sum;
			
		}
		return sum;
		
	}
	
}
