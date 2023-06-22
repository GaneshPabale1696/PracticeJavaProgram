package ArrayListVsHashTable;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList<>();
		
		ar.add(200); //0 index
		ar.add(100); //1 index
		ar.add(300); //2 index
		
		System.out.println(ar.size());

		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		ar.add(600);
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));//array out of bound exception
		
		//to print all the values of ArrayList:use for loop
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add('M');
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add(100);
		
		
	}

}
