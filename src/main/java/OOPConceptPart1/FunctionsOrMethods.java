package OOPConceptPart1;

public class FunctionsOrMethods {

	// main method-->strating point of execution
	public static void main(String[] args) {

		FunctionsOrMethods obj = new FunctionsOrMethods();
		// one object will be created,obj is the reference variable,referring to this
		// object
		// after creating the object ,the copy of all non static methods will be given
		// to this object

		obj.test();

		int l = obj.pqr();
		System.out.println(l);

		String s1 = obj.qa();
		System.out.println(s1);

		int div = obj.division(10, 2);
		System.out.println(div);

		
		//main method is void--never returns a value
		
	}

	// non static methods

	// void--does not return any value
	// return type = void
	public void test() {// no input ,no output
		System.out.println("test method");
	}

	// return type= int
	public int pqr()// no input ,some output
	{
		System.out.println("pqr methods");

		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	// return type-->string
	public String qa() {// no input ,some output
		System.out.println("qa method");

		String s = "Selenium";
		return s;
	}

	// retuen type =int
	// x,y-->input parameters/arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;

		return d;

	}

}
