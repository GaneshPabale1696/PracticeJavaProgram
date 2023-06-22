package com.PracticeJavaProg;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string or Number to reverse:");
		
		String s=sc.nextLine();
		
		int len=s.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is: "+ rev);

	}

}
