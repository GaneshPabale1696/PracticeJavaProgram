package ArrayListVsHashTable;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeAddress {

	public static void main(String[] args) {
		
		Employee2 emp=new Employee2(1,"Ganesh","Pune","Maharashtra");
		Employee2 emp1=new Employee2(2,"Mahesh","Solapur","Maharashtra");
		Employee2 emp2=new Employee2(3,"Umesh","Shirdi","Maharashtra");
		Employee2 emp3=new Employee2(4,"Adesh","Sangamner","Maharashtra");
		
		ArrayList<Employee2> list=new ArrayList<Employee2>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
	
		Iterator<Employee2> itr=list.iterator();
		
		while(itr.hasNext())
		{
			Employee2 empl=itr.next();
			
			System.out.print(empl.id +" ");
			System.out.print(empl.name +" ");
			System.out.print(empl.City +" ");
			System.out.println(empl.State +" ");
		}

	}

}
