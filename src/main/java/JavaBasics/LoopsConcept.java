package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1. while loop
		// dis-advantage of while loop: it will generate infinite loop if you do not
		// give incremental/decremental part

		int i = 1;// initialization

		while (i <= 10) { // conditional

			System.out.println(i);
			i = i + 1;// incremental/decremental
		}

		System.out.println("*******************");

		// 2. for loop
		// j++ means j=j+1;
		//print 1 to 10
		for (int j = 1; j <= 10; j++) {//initialization,conditional,incremental

			System.out.println(j);

		}
		
		System.out.println("*******************");

		//-1 > -10 true
		//1>10 false
		
		//10 to 1 
		//k-- means k=k-1;
		
		for (int k = 10; k >= -10; k--) {//initialization,conditional,incremental

			System.out.println(k);

		}

	}

}
