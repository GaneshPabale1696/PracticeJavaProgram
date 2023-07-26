package com.PracticeJavaProg;

public class CountCharactersFromString {

	public static void main(String[] args) {
	
		String str="This is my first Job";
		
		int len=str.length();
		
		int count=0;
		
		for(int i=-0;i<=len-1;i++) {
			if(str.charAt(i) !=' ') {
				count++;
			}
		}
		
		System.out.println("Total Number of characters in string is:"+ count);

	}

}
