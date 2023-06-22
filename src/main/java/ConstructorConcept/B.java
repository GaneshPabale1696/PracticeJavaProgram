package ConstructorConcept;

public class B extends A{
	
	public B() {
		super(); //is used to called parent class constructor
	}
	
	
	public B(int i) {
		super(i); //is always fist statement
	}
	
	public B(int i,int j) {
		super(i,j); //is used to called parent class constructor
	}
	

	public static void main(String[] args)
	{
		B obj=new B();
		B obj1=new B(10);
		B obj2=new B(10,20);
		
	}
	
}
