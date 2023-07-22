package com.PracticeJavaProg;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray1 {

	public static void main(String[] args) {

		String arr[] = { "c", "c", "c++", "python", "java" ,"java"};

		Set<String> langs = new HashSet<String>();
		
		boolean flag = false;

		for (String l : arr) {

			if (langs.add(l) == false) {

				System.out.println("Found Duplicate Element: " + l);
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("Not found duplicates");
		}
	}
}
