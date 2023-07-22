package com.PracticeJavaProg;

public class Vovels2 {

	public static boolean Vowel(char c) {
		return "aeiouAEIOU".indexOf(c)>=0;
	}
	
	public static void main(String[] args) {
	
		boolean isVowel=Vowel('T');
		
		if(isVowel) {
			System.out.println("vowel");
		} else
		{
			System.out.println("is not vowel");
		}
		

	}

}
