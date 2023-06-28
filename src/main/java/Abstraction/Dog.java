package Abstraction;

public class Dog extends Animal{
	
	Dog()
	{
		System.out.println("Dog is eat food");
	}
	
//	public final void eat() { //we can not override the final method
//		System.out.println("Animal---eat");
//	}

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		Animal.pattern(6);
		Animal.pattern1(6);
		Animal.pattern2(6);
		Animal.pattern3(6);
	}

}
