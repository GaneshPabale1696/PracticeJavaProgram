package com.PracticeJavaProg;

import java.util.HashMap;
import java.util.Map;

public class DistinnctCharactersCount {

	public static void main(String[] args) {
	
		printDistinctCharsWithCount("abcBB");
		printDistinctCharsWithCount("hi there, i am pankaj");

	}
	
	 public static void printDistinctCharsWithCount(String input) {
		 
		 Map<Character,Integer> charsWithCountMap=new HashMap<>();
		 
		 for(char c:input.toCharArray()) {
			 charsWithCountMap.merge(c, 1,Integer::sum);
		 }
		 
		 
		 System.out.println(charsWithCountMap);
		 
	 }
 
}
