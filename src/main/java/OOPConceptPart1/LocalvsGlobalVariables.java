package OOPConceptPart1;

public class LocalvsGlobalVariables {

	//Global vars -- class variable
	String name="Tom";	
	int age= 25;
	
	public static void main(String[] args) {
		
		int i =10;//local variable for main method
		System.out.println(i);
		
		LocalvsGlobalVariables ob=new LocalvsGlobalVariables();
		System.out.println(ob.age);
		System.out.println(ob.name);	
	
	}

	public void sum() {
		int i =10;//local variables for sum method
		int j=20;
	}
	
	
}
