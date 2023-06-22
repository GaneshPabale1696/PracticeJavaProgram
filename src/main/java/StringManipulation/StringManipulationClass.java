package StringManipulation;

import java.util.stream.IntStream;

public class StringManipulationClass {

	public static void main(String[] args) {
		
		String str="This is my first job is change";
		
		int len=str.length();
		System.out.println(len);
		
		char ch=str.charAt(1);
		System.out.println(ch);
		
		IntStream ch1=str.chars();
		System.out.println(ch1);
		
		long count=ch1.count();
		System.out.println(count);
				
		IntStream stream=IntStream.of(1,2,3,4,6,7,9,10);
		boolean ans=stream.allMatch(num -> true);
		System.out.println(ans);
		
		//int indexOf(char ch )
		//Parameters:
		//ch : a character.
		int itr=str.indexOf("s");
		System.out.println(itr);
		
		//int indexOf(String str)
		//Parameters:
		//str : a string.
		int it1=str.indexOf("my");
		System.out.println(it1);
		
		//int indexOf(char ch,int strt)
		//Parameters:
		//ch :a character.
		//strt : the index to start the search from.
		str.indexOf("s", 20);
		System.out.println(str.indexOf("s", 17));
		
		String s1=str.replace("T", "t");
		System.out.println(s1);

		String s2=str.replace("first","last");		
		System.out.println(s2);
		
		System.out.println("**********************");
		
		String s3=str.repeat(3);
		System.out.println(s3);
		
		//split string concept
		String str1="Looking_for_better_career@prospects_professional_growth";
		String[] st4=str1.split("s",2);
		
		for(String a:st4) {
			System.out.println(a);
		}
		
		System.out.println("*******************");
		
		String str2="Looking for.better career prospects professional growth";
		String[] st5=str2.split("[.]");
		
		for(String a:st5) {
			System.out.println(a);
		}
		
		System.out.println("*******************************");

		String str3="Looking for.better career prospects professional growth";
		String[] st6=str3.split(" ");
		
		for(String a:st6) {
			System.out.println(a);
		}
		
		System.out.println("*******************************");
		
		String str4="Looking, for.better? @career.. prospects ,professional. growth";
		String[] st7=str4.split("[, ?.@]+");
		
		for(String a:st7) {
			System.out.println(a);
		}
		
		System.out.println("******************************");
		
		String str5="    This is my first job is change      ";
		String str7=str5.stripTrailing();
		System.out.println(str7);
		
		String str6=str5.strip();
		System.out.println(str6);
		
		//compareTo
		if(str.compareTo(str5.trim())==0)
		{
			System.out.println("equal");
		} else
		{
			System.out.println("not equal");
		}
		
		//compareToIgnoreCase
		if(str.compareToIgnoreCase(str5.trim())==0)
		{
			System.out.println("is eqaul");
		}else
		{
			System.out.println("is not equal");
		}
		
		//contains 
		boolean b1=str.contains("This");
		System.out.println(b1);
		
		boolean b2=str.equals(str5.trim());
		System.out.println(b2);
	}

}
