package Interface;

public class MechanicalClass extends AbstractClass{
	
	//Abstract class methods
	@Override
	public void passport() {
		
		System.out.println("This is my new passport");
	}

	@Override
	public int Interest() {
		
		int value=45,store=0;
		for(int i=1;i<value;i++)
		{
			store = store + i;	
		}
		System.out.println(store);
		return store;
	}

	@Override
	void TestDemo() {
		System.out.println("Test Car Demo version");
		
	}
	
	//MechanicalClass methods
	public void testmech() {
		System.out.println("Test mechanical...");
	}
	
	public String TestDrive()
	{
		String str="Car working very slow";
		System.out.println(str);
		
		return str;
	}
	
	//Interface Class methods	
	@Override
	public void car() {
		System.out.println("test the car");	
	}

	@Override
	public void start() {
		System.out.println("Start the car");		
	}

	@Override
	public void engine() {
		System.out.println("Start the engine");
	}
	
	@Override
	public void credit() {
		System.out.println("Credit card is valid ");
		
	}

	@Override
	public void debit() {
		System.out.println("Debit card is valid");
	}

	@Override
	public void rate_of_interest() {
		System.out.println("Rate of interes is very attractive ");
		
	}
	
	@Override
	public int test(int a, int b) {
	
		int c=a+b;
		System.out.println("Sum is: " + c);
		return c;
	}
	
	
	public static void main(String[] args) {
	
		MechanicalClass mc=new MechanicalClass();
		mc.Go();
		mc.Interest();
		mc.passport();
		mc.TestDemo();
		mc.testmech();
		mc.TestDrive();
		mc.car();
		mc.engine();
		mc.start();
		mc.test(10, 20);
		
		System.out.println(InterFaceClass.a);
		System.out.println(InterFaceClass.str);
		
		//InterFaceClass.str="test data";//can not change the value because this is a final variable
		
		AbstractClass.forcre();
	
	}

	

	
}
