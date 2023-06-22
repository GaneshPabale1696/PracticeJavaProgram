package ArrayListVsHashTable;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		int a[]=new int[3];//static array --size is fixed
		
		//dynamic array--ArrayList
		//1. It can Contain duplicate values/elements
		//2. maintains insertion order
		//3. Not Synchronized
		//4. allow random access to fetch the element because it stores the values 
		//   on the basis of indexes
		
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(40);
		ar.add("test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size());//size of arraylist
		
		System.out.println(ar.get(4));//to get the value from an index
		
		//to print all the values from arraylist: for loop
		//1.for loop
		//2.using iterator
		
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic:
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Selenium");
		ar2.add("add");
		
		//ArrayList<E> ar3=new ArrayList<E>();
		
		//Employee class objects:
		Employee e1=new Employee("Ganesh",26,"QA");
		Employee e2=new Employee("Krushna",28,"Dev");
		Employee e3=new Employee("Shubham",27,"Admin");
		
		//Create arraylist
		ArrayList<Employee> a4=new ArrayList<Employee>();
		a4.add(e1);
		a4.add(e2);
		a4.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> it = a4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		System.out.println("**************");
		
		//addAll() method
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("add");
		ar5.add("test");
		
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("JavaScript");
		ar6.add("Java");
		ar6.add("Dev");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//removeAll
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*******************");
		
		//retainAll()
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("add");
		ar7.add("test");
		
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		ar8.add("Dev");
		
		ar7.retainAll(ar8);
		
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
		
	}

}
