package MethodandMethodOverloading;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		//create the object of class
		//obj is the reference variable
		FunctionsInJava obj=new FunctionsInJava();
		FunctionsInJava obj1=new FunctionsInJava();//we are creating n no. of objects
		
		int n= obj.div(10, 2);
		System.out.println(n);
		
		String str=obj.PQR();
		System.out.println(str);
		
		int j=obj.sum();
		System.out.println(j);
		
		String str1=obj.sendMail(10, "Ganesh");
		System.out.println(str1);
		
		obj.test();
		
	}
	
	//1.can not create a function inside a function
	//2.functions are independent to each other
	//3. functions are parallel to  each other(separete functions)
	//4. main method does not return any value, hence it is void 
	
	

	//1. no input no output
	//void--does not return any value
	public void test()//0 parameter
	{
		System.out.println("test method");
	}
	
	public void test(int i)//1 parameter
	{
		System.out.println("test method with one parameter");
	}
	
	public int test(int i,int j)//2 parameter
	{
		System.out.println("test method with two parameter");
		
		return 10;
	}

	public void test(String a,String b) {
		System.out.println("test method");
	}
	
	//Method Overloading:when in the some class,functions are having the same name with 
	//different parameters.
	
	
	//2. no input some output
	//return type:int 
	public int sum()
	{
		System.out.println("SUM Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	
	public String PQR()
	{
		System.out.println("PQR method");
		String s="Selenium";
		return s;
	}
	
	//3. Some input and some output
	public int div(int x,int y)
	{
			System.out.println("DIV method");
			int z=x/y;
			return z;
	}
	
	public String sendMail(int p,String q)
	{
		System.out.println("Send mail method");
		String h=q+p;
		return h;
	}
	
}
