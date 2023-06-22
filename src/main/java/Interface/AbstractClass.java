package Interface;

public abstract class AbstractClass implements InterFaceClass {

	int rate_of_interest;

	static String str = "This is my first job";

	public abstract void passport();

	public abstract int Interest();

	abstract void TestDemo();
	
	public abstract int test(int a,int b);

	public void Go() {
		System.out.println("Go to school..");
	}

	public static String forcre()// Static method is allowed in abstract class
	{
		String str = "This is a first force police";
		System.out.println(str);
		return str;
	}

//	public abstract static int forcre1() //this is not allowed in abstract class
//	{
//		return 0;
//	}

	public static void main(String[] args) {

//		InterFaceClass iner=new AbstractClass();//Cannot instantiate the type AbstractClass
//		iner.car();

	}

}
