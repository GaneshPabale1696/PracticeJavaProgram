package AggregationInJava;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
	//	this.address=address;
		this.address=new Address(address.getNumber(),address.getStreet(),address.getZip());
		
	}
	
	public Address getAddress()
	{
		return this.address;
	}
	
	public void setAddress(Address address)
	{
		this.address=address;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
}
