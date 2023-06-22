package Constructortopic;

public class Car {

	String name;
	int price;
	String engine;
	
	public Car(String name,int price,String engine)
	{
		this.name=name;
		this.price=price;
		this.engine=engine;
	}
	
	public static void main(String[] args) {

		Car obj1=new Car("BMW",10,"Automatic");
		System.out.println(obj1.name+" "+obj1.price+" "+obj1.engine);
		Car obj2=new Car("Audi",20,"Automatic");
		System.out.println(obj2.name+" "+obj2.price+" "+obj2.engine);	
	
	}
}
