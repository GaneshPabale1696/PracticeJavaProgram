package com.PracticeJavaProg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,6,8,2,1,9};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			 set.add(a[i]);
		}

		Integer[] b= set.toArray(new Integer[set.size()]);//valid one
		
		//Object[] v=set.toArray(new Integer[set.size()]);//valid one
		
		//System.out.println(Arrays.toString(v));
		
		System.out.println(Arrays.toString(b));//valid
		
	}

}
