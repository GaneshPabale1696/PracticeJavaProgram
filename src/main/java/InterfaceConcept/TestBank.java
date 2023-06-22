package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
			
		
		HSBCBank hs =new HSBCBank();
		hs.carLoan();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.transferMoney();
		hs.Test();
		
		

		//dynamic polymorphism
		//child class object can be referred by parent interface reference variable
		 USBank b=new HSBCBank();
		 b.credit();
		 b.debit();
		 b.transferMoney();
		 
		 BrazilBank bz=new HSBCBank();
		 bz.Test();
		  
	}

}
