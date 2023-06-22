package Constructortopic;

public class ConstructorConcept {

	//constructor never return any value
	//constructor is not a function
	//constructor is same as class name
	//constructor can be overloaded
	
	String name;
	int age;
	
	public ConstructorConcept()//0 parameter constructor
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i)//1 parameter constructor
	{
		System.out.println("1 param Constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i,int j)//2 parameter constructor
	{
		System.out.println("2 param Constructor");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcept(String name,int age) {
		this.name=name;//this.classvar=localvar
		this.age=age;
		//System.out.println(name+" "+age );
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);	
		ConstructorConcept obj2=new ConstructorConcept(10,13);
		ConstructorConcept obj3=new ConstructorConcept("Tom",16);
		System.out.println(obj3.name+" "+obj3.age);
	}
}
