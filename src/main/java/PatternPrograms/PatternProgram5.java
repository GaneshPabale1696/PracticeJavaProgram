package PatternPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternProgram5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number:");
		String m=br.readLine();
		Integer n=Integer.valueOf(m);

		
		for(int i=1;i<=n;i++) {
			
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
	    	for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		for(int a=n-1;a>=1;a--) {
			
			for(int d=n;d>=a;d--) {
				System.out.print(" ");
			}
			
			for(int h=1;h<=a;h++) {
				System.out.print(h+" ");
			}
			
			for(int v=a-1;v>=1;v--) {
				System.out.print(v+" ");
			}
	
			System.out.println();
		}
		
		

	}

}
