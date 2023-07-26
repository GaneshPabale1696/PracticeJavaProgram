package com.PracticeJavaProg;

public class CountSumofNumberFromString {

	public static void main(String[] args) {
	
		String str="123dheeraj123";
		
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		
			System.out.println("Sum of all the digit present in String:"+ sum);

	}

}
