package com.PracticeJavaProg;

import java.util.Scanner;

public class FactorialByRecursion {

	
	static int fact = 1;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		
		int no=sc.nextInt();
		
		FactorialByRecursion ob=new FactorialByRecursion();
		ob.CalFact(no);
		System.out.println("Factorial of "+ no + " is " + fact);
	}

	void CalFact(int no) {

		if(no>=1) {
			fact = fact * no;
			CalFact(no-1);
		}
		
	}
	
	
}
