package PatternPrograms;

public class NumberPattern3 {

	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=n;i>=1;i--){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
		

	}

}
