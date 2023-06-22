package com.PracticeJavaProg;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want to:");
		
		int no=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(no+ "*" + i + " ="+ no*i);
		}
		

	}

}
