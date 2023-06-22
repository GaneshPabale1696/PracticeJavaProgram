package JavaBasics;

public class IfElaseConcept {

	public static void main(String[] args) {
		int a=50;
		int b = 20;
		
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
		
		//comparison operators:
		//< > <= >= == !=
		
		int c=40;
		int d=50;
		
		if(c==d) {
			
			System.out.println("c and d are equal");
		} else
		{
			System.out.println("c and d are not equal");
		}
		
		
		//write a logiic to find out highest number
		
		int a1 =600;
		int b1 =900;
		int c1=300;
		
		//nested if else

		if(a1>b1 & a1>c1) {
			
		System.out.println("a1 is greater");
			
		} else if(b1>c1) {
			System.out.println("b1 is greater");
		}
		else {
			System.out.println("c1 is greater");
		}

	
	}

}
