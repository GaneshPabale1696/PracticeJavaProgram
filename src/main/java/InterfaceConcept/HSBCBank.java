package InterfaceConcept;

public class HSBCBank implements USBank,BrazilBank{//We are achieving multiple inheritance	
//Is-a relationship(Interface)
	
	//If a class is implementing any interface, then its mandatory to define
	//override all the methods of interface.
	
	//overriding from USBank
	public void credit()
	{
		System.out.println("hsbc--credit");
	}
	
	public void debit() {	
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney()
	{
		System.out.println("hsbc--transfermoney");
	}
	
	//Seperate methods of HSBCBank
	public void educationloan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--Car Loan");
	}
	
	//Brazil Bank Method:Override from BrazilBank
	public void mutualfund() {
		System.out.println("HSBC Mutual fund");
	}
	
}
