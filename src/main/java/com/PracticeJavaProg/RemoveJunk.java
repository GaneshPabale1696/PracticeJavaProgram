package com.PracticeJavaProg;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="a#$%%&*&&*$#!?^ latin string 0123456789";
		
		String s2="%%$#%% testing %%$### Selenium &&^%$$ Java";
		
		String s1= s.replaceAll("[^a-zA-Z0-9]","");

		System.out.println(s1);
	
		String s3=s2.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s3);
		
	}

}
