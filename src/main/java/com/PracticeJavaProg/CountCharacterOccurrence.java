package com.PracticeJavaProg;

public class CountCharacterOccurrence {

	public static void main(String[] args) {

		String s="Java Programing Java oopssss";
		
		int totalcount = s.length();
		
		int totalcount_afterremove=s.replace("s","").length();//total len after removing a's
		
		int count =totalcount - totalcount_afterremove;
		
		System.out.println("Number of Occurences of J is:" + count);

	}

}
