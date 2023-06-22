package JavaBasics;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
		
		//++
		//--
		
		int i =1;
		int j= i++;//post increment
		
		System.out.println("value of i is: " +i);
		System.out.println("value of j is: " +j);
		
		int a=1;
		int b=++a;//pre increment
		
		System.out.println("value of a is: " + a);//2
		System.out.println("value of b is: " + b);//2
		
		int m =2;
		int n= m--; //post decrement
		
		System.out.println("value of m is: "+m);
		System.out.println("value of n is: "+n);
	
		int p=2;
		int q=--p;
		
		System.out.println("value of p is: "+p);//1
		System.out.println("value of q is: "+q);//1
		
	}

}
