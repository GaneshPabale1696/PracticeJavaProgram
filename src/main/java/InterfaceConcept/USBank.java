package InterfaceConcept;

public interface USBank {

	int min_bal=100; //static and Final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration
	//no method body -- only method prototype
	//in interface,we can declare variables, vars by default static in nature
	//variables value will not be changed,its final/constant in nature
	//no static method in interface
	//no main method 
	//we can not create the object of interface
	//Interface is abstract in nature
	
	
	
		
}
