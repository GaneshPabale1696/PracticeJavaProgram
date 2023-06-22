package com.PracticeJavaProg;

public class AllPatternPrograms {

	public static int pattern1(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=n;k>=i;k--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		return n;	
	}
	
	
	public static void main(String[] args) {
		
		pattern1(6);

	}

}
