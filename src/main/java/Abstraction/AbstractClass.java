package Abstraction;

abstract class AbstractClass {

	int rate_of_interest;
	
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
