package com.PracticeJavaProg;

public class AllPatternPrograms {

	public static int pattern1(int n) {
		System.out.println("**********pattern1**************");
		for(int i=1;i<=n;i++)
		{	
			for(int k=n;k>=i;k--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		return n;	
	}
	
	public static int pattern2(int n) {
		System.out.println("**********pattern2**************");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		return n;	
	}
	
	public static int pattern3(int n) {
		System.out.println("**********pattern3**************");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		return n;	
	}
	
	public static int pattern4(int n) {
		System.out.println("**********pattern4**************");
		
		for(int i=1;i<=n;i++)
		{
			for(int l=n;l>i;l--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		return n;	
	}

	
	public static int pattern5(int n) {
		System.out.println("***********pattern5*************");
		
	for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		return n;	
	}

	public static int pattern6(int n) {
		System.out.println("************************");
		
	for(int i=1;i<=n;i++)
		{
		for(int k=n;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
				System.out.println();
		}
		return n;	
	}
	
	public static int pattern7(int n) {
		System.out.println("***********pattern5*************");
		
	for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		return n;	
	}
	
	public static int pattern8(int n) {
		System.out.println("***********pattern8*************");
		
	for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		return n;	
	}
	
	public static void main(String[] args) {
		
		pattern1(6);
		pattern2(6);
		pattern3(6);
		pattern4(3);
		pattern5(6);
		pattern6(6);
		pattern7(5);
		pattern8(7);
	}

}
