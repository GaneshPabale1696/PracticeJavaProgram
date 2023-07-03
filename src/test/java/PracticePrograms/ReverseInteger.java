package PracticePrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num=123457898,num1=234566, rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("reverse number is: "+rev);

		//2.StringBuffer
		
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		
	}

}
