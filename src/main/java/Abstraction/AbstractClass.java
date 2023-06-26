package Abstraction;

abstract class AbstractClass {

	static int rate_of_interest;
	
	AbstractClass()//Abstract class have constructors
	{
		System.out.println("parent class constructor is called");
	}
	
	public abstract int add();

	public abstract int substract();

	public int multiplication(int a, int b) {
		int multiplication = a * b;
		System.out.println("Multiplication is: " + multiplication);

		return multiplication;
	}

	public void Test() {
		System.out.println("test data..");
	}

}
