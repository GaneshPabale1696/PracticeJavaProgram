package com.PracticeJavaProg;

import java.util.Scanner;

public class PalindromeNumberandString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String or Number :" );
		
		String str=sc.nextLine();
		
		int i = str.length();
		
		String rev="";
		
		for(int j=i-1;j>=0;j--) {
			
			rev = rev + str.charAt(j);
		}
		
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Given number or string is palindrome");
		}
		else
		{
			System.out.println("Given number or string is not palindrome");
		}
		
	}

}
