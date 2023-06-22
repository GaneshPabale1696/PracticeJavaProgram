package CompositionInJava;

public class Employee {

	String name;
	String eid;
	EmployeeAddress empaddr; //aggregation
	//here empaddr is now global. we can use it anywhere in our class 
	
	Employee(String name,String eid){
		this.name=name;
		this.eid=eid;	
		empaddr=new EmployeeAddress("Ganesh Nagar,Sangamner","Pune",411043);//association
	}
	
	public Employee(EmployeeAddress empaddr) {
		this.empaddr=empaddr;
	}
	
	void showEmployee()
	{
		System.out.println("Employee Name:" + name + " Eid: "+ eid);
		System.out.println(empaddr.street+" "+empaddr.city+" "+empaddr.pincode);
	}
	
	void Empshow()
	{
		System.out.println(empaddr.street+" "+empaddr.city+" "+empaddr.pincode);
	}
	
	public static void main(String[] args)
	{
		Employee e=new Employee("Ganesh","12");
		e.showEmployee();
		Employee e2=new Employee(new EmployeeAddress("Balaji nagar","Pune",411043));
		e2.Empshow();
		
	}
	
}
