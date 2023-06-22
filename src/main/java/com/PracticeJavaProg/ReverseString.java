package com.PracticeJavaProg;

public class ReverseString {

	public static void main(String[] args) {
		String str="Ganesh" ,rev="", rev1 = "";
		
		System.out.println("Before reverse a string:" + str);
		
		int i=str.length();
		
		for(int j=i-1;j>=0;j--) {
			
			rev=rev + str.charAt(j);
	
		}

			System.out.println("The Reverse string is: "+ rev);
		
		//2. Using character array
			
			String str1="Mahesh";
			
			char ch[]=str1.toCharArray();
			
			int len=ch.length;
			
			for(int j=len-1;j>=0;j--) {
				
				rev1=rev1 + ch[j];
		
			}
			System.out.println("The Reverse string is: "+ rev1);
		
		//3.Using StringBuffer
			
			String str2="Test";
			
			StringBuffer sb=new StringBuffer(str2);
			StringBuffer rev2=sb.reverse();
			
			System.out.println(rev2);
			
	}


}
