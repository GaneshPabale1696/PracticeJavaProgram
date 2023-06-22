package com.PracticeJavaProg;

public class Vovels {

	public static boolean vowel(char c)
	{
		return "aeiouAEIOU".indexOf(c)>=0;
	}
	
	
	public static void main(String[] args) {
		boolean isVowel=vowel('e');

		if(isVowel) {
			System.out.println("vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
	}

}
