package OOPConceptpart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphisam -- compiletime polymorphisam
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("************");
		
		Car c=new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		
		System.out.println("************");
		
		//top casting 
		Car	c1 =new BMW();//child class object can be referred by parent class 
						  //reference variable--Dynamic polymorphisam -->runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//down casting
		BMW b1 =(BMW) new Car();//classCastException	
		
	}

}
