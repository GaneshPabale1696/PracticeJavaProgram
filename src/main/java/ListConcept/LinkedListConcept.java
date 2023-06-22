package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("content of linklist:"+ ll );
		
		//addfirst
		ll.addFirst("Ganesh");
		
		//addlast
		ll.addLast("Automation");
		
		System.out.println("content of linklist:"+ ll );

		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0,"Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("content of linklist:"+ ll );
		
		ll.remove(2);
		
		System.out.println("content of linklist:"+ ll );
		
		//how to print all the values of LinkedList
		//for loop
		System.out.println("using for loop");
		
		for(int n=0;n<ll.size();n++) {
			
			System.out.println(ll.get(n));
		}
		
		//advance for loop
		System.out.println("***advance for loop");
		
		for(String str:ll) {
			
			System.out.println(str);
		}
		
		//iterator
		System.out.println("***Using Iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("***Using While loop");
		
		int num =0;
		
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
