package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvseries= new ArrayList<String>();
		tvseries.add("Game of Thrones");
		tvseries.add("Breaking Bad");
		tvseries.add("The Big bang theory");
		tvseries.add("The Walking Dead");
		tvseries.add("Prison break");
		
		System.out.println("****print using lambda Expression*********");
		
		//1.lambda expression
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("****print using iterator*********");
		
		//2. using Iterator
		
		Iterator<String>itr= tvseries.iterator();
		
		while(itr.hasNext()) {
			
			String shows=itr.next();
			System.out.println(shows);
		}
		
		//3. using iterator and java8 forEachRemaining() method
		 System.out.println("******* using iterator and java8 lambda forEachRemaining() method *******");
		itr = tvseries.iterator();
		itr.forEachRemaining(shows -> {
			System.out.println(shows);
		});
		 
		//4. using for each loop:
		
		 System.out.println("******* print using for each loop *******");
		
		 for(String show: tvseries)
		 {
			 System.out.println(show);
		 }
		
		 //5. using for loop with order/index
		 
		 System.out.println("*** using for loop with order/index ****");
		 
		 for(int i=0;i<tvseries.size(); i++) {
			 
			 System.out.println(tvseries.get(i));
			 }
		 
		 //6. using a listIterator() to traverse in both direction
		 
		 System.out.println("using a listIterator() to traverse in both direction");
		 
		 ListIterator<String> tvseriesListIterator=tvseries.listIterator(tvseries.size());
		 
		 while(tvseriesListIterator.hasPrevious())
			 {
			 String show = tvseriesListIterator.previous();
			 System.out.println(show);	  
		    }
		 
	}

}
