package com.PracticeJavaProg;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int temp=num;
		
		int rev=0;
		
		int rem;
		
		while(num!=0)
		{
			 rem=num%10;
			 rev=rev*10 + rem;
			 num=num/10;
		}
		
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		} else
		{
			System.out.println("Number is not palindrome");
		}
		

	}

}
