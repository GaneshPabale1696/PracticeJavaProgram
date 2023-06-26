package Abstraction;

public class Dog extends Animal{
	
	Dog()
	{
		System.out.println("Dog is eat food");
	}

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		Animal.pattern(6);
		Animal.pattern1(6);
		Animal.pattern2(6);
		Animal.pattern3(6);
	}

}
