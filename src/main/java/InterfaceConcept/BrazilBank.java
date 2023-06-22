package InterfaceConcept;

public interface BrazilBank {
	
	public void mutualfund();
	
	public static void test() {
		System.out.println("Java");
	}

	public default void Test()
	{
		System.out.println("This is a default Interface method");
	}
	
}
