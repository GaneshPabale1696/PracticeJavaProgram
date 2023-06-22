package Interface;

public class DemoClass extends AbstractClass implements InterFaceClass {

	//DemoClass methods
		public void tyer()
		{
			System.out.println("Tyer of vegicle is black");
		}
		
		public void seat()
		{
			System.out.println("Vehicle has Seat");
		}
		
		public void vehiclewindow()
		{
			System.out.println("vegicle has window");
		}
		
		
		//override method from interface class
		@Override
		public void car() {
			System.out.println("BMW is a car..");
		}

		@Override
		public void start() {
			System.out.println("Start is a common method..");
		}

		@Override
		public void engine() {
			System.out.println("Car has a engine..");
			
		}

		
		//methods override from abstract class
		@Override
		public void passport() {
			System.out.println("Every person has a passport..");
			
		}

		@Override
		public int Interest() {
			int interest=8;
			System.out.println(interest);
			return interest;
		}

		@Override
		void TestDemo() {
			System.out.println("Test Demo...");	
		}
		
		@Override
		public void credit() {
		System.out.println("Somthing new");
		}

		@Override
		public void debit() {
			System.out.println("Somthing different");
			
		}

		@Override
		public void rate_of_interest() {
			System.out.println("Somthing very funny");
			
		}
		
		@Override
		public int test(int a, int b) {
			
			int c=a/b*100;
			System.out.println("divison is: "+ c);
			return c;
		}
	
	public static void main(String[] args) {
		
		DemoClass dmo=new DemoClass();
		dmo.rate_of_interest=10; //abstract class variable
		System.out.println(dmo.rate_of_interest);
		
		System.out.println("******Interface class methods*******");
		//Interface class methods
		dmo.car();
		dmo.engine();
		dmo.DefaultMethodofInterface();//It is default method of interface--its inherit from interface class
		dmo.engine();
		
		System.out.println("****Abastract class methods*****");
		//Abastract class methods
		dmo.Interest();
		dmo.passport();
		dmo.Go();
		dmo.TestDemo();
		
		System.out.println("***DemoClass methods****");
		//DemoClass methods
		dmo.tyer();
		dmo.vehiclewindow();
		dmo.seat();
		
		System.out.println("********************");
		
		System.out.println(InterFaceClass.a);
		
		System.out.println("********************");
		
		 InterFaceClass interfacedmo=new DemoClass();
		 interfacedmo.car();
		 interfacedmo.engine();
		 interfacedmo.start();
		 interfacedmo.DefaultMethodofInterface();
		 
		 System.out.println("********************");

		 AbstractClass abs=new DemoClass();
		 abs.rate_of_interest=9;
		 System.out.println(abs.rate_of_interest);
		 abs.Go();
		 abs.Interest();
		 abs.passport();
		 abs.TestDemo();
		 abs.credit();
		 abs.debit();
		 abs.rate_of_interest();
		 abs.test(10,5);
		 
		 
		 System.out.println("********************");
		 
		 //static method of the Interface class
		 InterFaceClass.test();

	}	
}
