package CompositionInJava;

public class Car {
	
	String modelName;
	float price;
	CarEngine carEngine;
	
	Car(String modelname,float price){
		this.modelName = modelname;
		this.price=price;
		carEngine=new CarEngine(7);
	
	}
	
	public void show()
	{
		System.out.println("Model is: "+ modelName +"Price is: "+ price);
		System.out.println("Car generation is: "+carEngine.gen);
	}

	public static void main(String[] args)
	{
		Car car=new Car("BMW",20000);
		car.show();
		
	}
	
	
}
