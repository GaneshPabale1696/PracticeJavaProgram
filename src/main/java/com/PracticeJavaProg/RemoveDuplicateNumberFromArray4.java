package com.PracticeJavaProg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromArray4 {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,5,5,6,7,7};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}

       Integer[] b=hs.toArray(new Integer[hs.size()]);
       
       System.out.println(Arrays.toString(b));
		
		for(int no:hs) {
			System.out.print(no +" ");
		}
		
		System.out.println();
		
		String[] str= {"Java","Python","Eclipse","C","C","Java"};
		
		Set<String> hs1=new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			hs1.add(str[i]);
		}

		String[] d=hs1.toArray(new String[hs1.size()]);
		
		System.out.println(Arrays.toString(d));
			
		for(String s :hs1) {
			System.out.print(s +" ");
		}
		
	}

}
