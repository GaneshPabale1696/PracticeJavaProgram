package ConstructorConcept;

public class ConstructorWithThisKeyword {
	
	//Class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age){
		
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args)
	{
		ConstructorWithThisKeyword cwtk=new ConstructorWithThisKeyword("Tom",30);
		ConstructorWithThisKeyword cwtk1=new ConstructorWithThisKeyword("peter",35);
	}

}
