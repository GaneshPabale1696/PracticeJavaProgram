package ConstructorConcept;

public class ConstructorConceptClass {
	
	//default constructor
	//we can overload constructor
	public ConstructorConceptClass() {
		System.out.println("This is a Default Constructor");
	}
	
	public ConstructorConceptClass(int i) {
		System.out.println("This is a Single param Constructor");
		System.out.println("the value of i: "+ i);
	}
	
	public ConstructorConceptClass(int i,int j) {
		System.out.println("This is a Two Param Constructor");
		System.out.println("the value of i "+ i);
		System.out.println("the value of j "+ j);
	}

	public static void main(String[] args) {
		
		ConstructorConceptClass obj=new ConstructorConceptClass();
		ConstructorConceptClass obj1=new ConstructorConceptClass(10);
		ConstructorConceptClass obj2=new ConstructorConceptClass(10,20);
		
		
	}

}
