package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//it is similar to hashmap, but it is synchronised.
		//stores the value on the basis of key-value
		//key-->Object--HashCode-->value
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//create a clone copy/shallow copy:
		Hashtable h2=new Hashtable();
		
		h2=(Hashtable)h1.clone();
		
		System.out.println("the values from h1" + h1);
		System.out.println("the values from h2" + h2);
		
		h1.clear();

		System.out.println("the values from h1" + h1);
		System.out.println("the values from h2" + h2);
		
		//contains value:
		Hashtable<String,String> st= new Hashtable<String,String>();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen")) {
			System.out.println("Value is found");
		}
		
		//print all the values from Hashtable using ---Enumeration--elements()
		
		Enumeration<String> e =st.elements();
		System.out.println("print values from st");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entrySet()-- set of hashtable values
		System.out.println("print values from st using entry set");
		
		 Set s=  st.entrySet(); 
		 System.out.println(s);
		 
		 Hashtable<String,String> st1= new Hashtable<String,String>();
			st1.put("A", "Naveen");
			st1.put("B", "Manager");
			st1.put("C", "Selenium");
			st1.put("C", "Selenium");//it contains unique values 
			//no null key and null values
			//st1.put("D",null); //null pointer exceptuion
		
			System.out.println("Values from st1:");
			 System.out.println(st1);
			
			//check both the hashtables are equal or not
			if(st1.equals(st))
			{
				System.out.println("both are equal");
			}
		 
		//get the values from a hey:
			System.out.println(st1.get("A"));
			
		//get the hashcode of hashtable object:
			System.out.println("the hash code value of st1: " + st1.hashCode());
			
			//generics:
			Hashtable<String, String> st3 = new Hashtable<String,String>();
			
			
	}

}
