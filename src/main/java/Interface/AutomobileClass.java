package Interface;

public class AutomobileClass implements InterFaceClass {
	
	public void car() {
		
		System.out.println("This is my second hand car");
	}

	public void start() {
		System.out.println("This is start function");
		
	}

	public void engine() {
		System.out.println("Car has a powerful engine");
	}
	
	public void engineer()
	{
		System.out.println("This car is made by engineer");
	}
	
	public void Number()
	{
		System.out.println("Each vehicle has unique number");
	}

	public static void main(String[] args) {
		
		AutomobileClass auto=new AutomobileClass();
		
		//Interface methods
		auto.car();
		auto.engine();
		auto.start();
		
		//AutomobileClass methods
		auto.engineer();
		auto.Number();
		
		System.out.println("******************************");
		
		//create reference object
		InterFaceClass inter=new AutomobileClass();
		inter.car();
		inter.engine();
		inter.start();
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rate_of_interest() {
		// TODO Auto-generated method stub
		
	}

	public void test() {
		// TODO Auto-generated method stub
		
	}



}
