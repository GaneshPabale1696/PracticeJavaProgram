package ExceptionHandling;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {

	YoungerAgeException(String msg){
		super(msg);
	}
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age:");
		
		int age=s.nextInt();
		try {
		if(age<18) {
			throw new YoungerAgeException("You are not eligible for voting");
		} else
		{
			System.out.println("You can vote successfully");
		}
		} catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello");
	}
}
