package ArrayListVsHashTable;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
	
		Department dept1=new Department(1, "Physics", "Pune");
		Department dept2=new Department(2, "Math", "Satara");
		Department dept3=new Department(3, "Science", "Thane");
		
		ArrayList<Department> arr=new ArrayList<Department>(); 
		arr.add(dept1);
		arr.add(dept2);
		arr.add(dept3);
		
		Iterator<Department> itr=arr.iterator();
		
		while(itr.hasNext()) {
			
			Department Dep=itr.next();
			System.out.print(Dep.id+" ");
			System.out.print(Dep.name+" ");
			System.out.print(Dep.city+" ");
			
		}
		
	}

}
