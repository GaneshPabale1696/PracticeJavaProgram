package com.PracticeJavaProg;

import java.util.HashMap;
import java.util.Map;

public class FindCharOccuranceUsingHashMap {

	public static void main(String[] args) {
	
		String str="GsaneshPabale";
		
		char[] prog=str.toCharArray();
		
		Map<Character,Integer> dup=new HashMap<>();

		for(char key : prog)
		{
			if(dup.containsKey(key)) {
				dup.put(key, dup.get(key)+1);
			} else
			{
				dup.put(key,1);
			}
		}
		
		System.out.println(dup);
	}

}
