package Abstraction;

public class OverrideAbstractMethods extends AbstractClass {
	
	OverrideAbstractMethods()
	{
		System.out.println("Child class constructor is called");
	}
	
	
	@Override
	public int add() {
		 int a=20; 
		 int b=10; 
		 int add= a + b; 
		 System.out.println("Addition is: " +add);
		 return add; 
	}

	@Override
	public int substract() {
	
		int a=30; 
		int b=10; 
		int substract=a - b; 
		System.out.println("Substraction is: "+ substract);
		return substract;	
	}
	
	public int factorial()
	{
		int fact=1,n=5;
		
		for(int i=1;i<=n;i++) {
		
			fact=fact*i;		
		}
		
		System.out.println("factorial of n is: " + fact);
		
		return fact;
	}
	
	public void Test()
	 {
		 System.out.println("Sub class test data..");
	 }
	
	public  void patternprogram(int num)
	{
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
			
	}
	
	
	public static void main(String[] args) {
		
		//static polymorphism
		OverrideAbstractMethods override=new OverrideAbstractMethods();
		override.multiplication(18,23);
		override.add();
		override.substract();
		override.factorial();
		override.Test();
		AbstractClass.rate_of_interest=10;	
		System.out.println(override.rate_of_interest);
		override.patternprogram(5);
		
		
		System.out.println("*******************");
		
		//dynamic polymorphism
		AbstractClass abs=new OverrideAbstractMethods();
		abs.add();
		abs.substract();
		abs.multiplication(10, 10);
		abs.Test();
		AbstractClass.rate_of_interest=20;
	
		System.out.println(abs.rate_of_interest);
		
		System.out.println("*******************");
		
		FactorialNumber(5);
		
		System.out.println("*******************");
		
		OverrideAbstractMethods.FactorialNumber(10);
		
		System.out.println("*******************");
		
		DataAnalyze("Data");
		
		System.out.println("*******************");
		
		fabinocciseries(10);
		
		System.out.println("*******************");	
		
	}

	public static int FactorialNumber(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
		
			fact=fact*i;		
		}
		
		System.out.println("factorial of n is: " + fact);
		
		return fact;
	}
	
	
	public static String DataAnalyze(String str) {
		
		if(str.equals("Test"))
		{
			System.out.println("Data is equal");
		}
		else
		{
			System.out.println("Data is not equal");
		}
		return str;
	}
	
	
	public static int fabinocciseries(int num)
	{
		int n1=0,n2=1,sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=num;i++)
		{
			sum=n1 + n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		System.out.println();
		return sum;	
	}
	
	
	
	}
	
	
