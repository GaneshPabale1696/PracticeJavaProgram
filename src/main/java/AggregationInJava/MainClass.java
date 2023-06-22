package AggregationInJava;

public class MainClass {

	public static void main(String[] args) {
		
		Address addr=new Address(123,"Ganesh Nagar",411043);
		Employee emp1=new Employee(1,"sam", addr);
		addr.setZip(411042);
		
		emp1.getAddress().setZip(422605);
		
		System.out.println(emp1.getAddress().getZip());
		
		System.out.println(emp1.getId()+" "+emp1.getName()+" "+addr.getNumber()+" "+addr.getStreet()+" "+addr.getZip());

		System.out.println(emp1.getAddress().getStreet());
		System.out.println(emp1.getAddress().getNumber());
		System.out.println(emp1.getAddress().getZip());

		System.out.println(emp1.getAddress());

		
		
	}

}
