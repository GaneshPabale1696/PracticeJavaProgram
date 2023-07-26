package com.PracticeJavaProg;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sc.nextLine();
		
		int len=str.length();
		
		int count=1;
		
		for(int i = 0;i<len-1;i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				
					count++;
			}
			
		}
		
		System.out.println("Number of words in string:" + count);
		
	}

}
