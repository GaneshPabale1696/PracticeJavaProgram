package ConstructorConcept;

public class A {

	public A()
	{
		System.out.println("Parent Class constructor");
	}	
	
	public A(int i) {
		System.out.println("parent class const with value of i "+ i);
	}
	
	public A(int i,int j) {
		System.out.println("parent class const with value of i "+ i);
		System.out.println("parent class const with value of j "+ j);
	}
	
}
