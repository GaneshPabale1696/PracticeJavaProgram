package com.PracticeJavaProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyradimicPatternProgram {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		String num=br.readLine();
		Integer n=Integer.valueOf(num);

		for (int i = 1; i <= n-1; i++) {

			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}

			System.out.println();
		}

		for (int a = n; a >= 1; a--) {

			for (int g = n; g> a; g--) {
				System.out.print(" ");
			}

			// Loop to iterate over each column of the ith row
			for (int j = 1; j <=a; j++) {
				System.out.print(j + " ");
			}
			
			for(int f=a-1;f>=1;f--){
				System.out.print(f+ " "); 
			}

			System.out.println();
		}

	}

}
