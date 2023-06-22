package JavaBasics;

public class TowDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println("Total no. of rows: " + x.length); //3--total no. of rows = 3
		System.out.println("Total no. of column: " +x[0].length);
		
				//1 st row
				x[0][0] = "A";
				x[0][1] = "B";
				x[0][2] ="C";
				x[0][3] ="D";
				x[0][4] ="E";
				
				//2nd row
				x[1][0] = "E";
				x[1][1] = "F";
				x[1][2] ="G";
				x[1][3] ="H";
				x[1][4] ="I";
			
				//3rd row
				x[2][0] = "H";
				x[2][1] = "I";
				x[2][2] ="J";
				x[2][3] ="K";
				x[2][4] ="L";
				
				
				System.out.println(x[1][2]);
				System.out.println(x[2][2]);
	
				System.out.println(x[0][4]);	
				
				//print all the values of 2D array:use for loop
				
				
				for (int row = 0; row <x.length;row++) {
					
					for(int col=0;col<x[0].length;col++) {
						System.out.print(x[row][col] + " " );
					}
					System.out.println();
				}
				
				
	}

}
