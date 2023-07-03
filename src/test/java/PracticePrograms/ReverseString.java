package PracticePrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String
		
		String s="Selenium";
		
		int len = s.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
	
		//2.StringBuffer
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
	}
	
	
	
			
}
