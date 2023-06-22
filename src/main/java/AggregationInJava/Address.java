package AggregationInJava;

public class Address {

	private int number;
	private String street;
	private int zip;
	
	public Address()
	{
		
	}
	
	public Address(int number,String street,int zip) {
		this.number = number;
		this.street=street;
		this.zip=zip;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String toString()
	{
		return this.number +" "+this.street +" "+this.zip; 	
	}
	
}
