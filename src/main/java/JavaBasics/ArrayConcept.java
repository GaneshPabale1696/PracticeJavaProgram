package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store similar data type values in a array variable
		
		
		//disadvantages of array:
		//1.size is fixed -- static array--to overcome this problem--we use collections--ArrayList,HashTable--use dynamic array
		//2.stores only similar data types--to overcome to this problem,we use object array
		

		//1. int array
		//lowest bound/index = 0
		//upper bound /index =n-1(n is a size of an array)		
		// One Dimensional array
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		//int i =10;
		//i=20;
		
		System.out.println(i.length);//size/length of array
		
		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2. double
		double d[]=new double[4];
		
		d[0] = 12.34;
		d[1] = 13.34;
		d[2] = 15.34;
		d[3] = 18.34;
		
		System.out.println(d[2]);
		
		//3. char array:
		char c[]=new char[3];
		c[0]='A';
		c[1]='2';
		c[2]='$';
		
		//4. boolean array
		 
		boolean b[]=new boolean[2];
	
		b[0]=true;
		b[1]=false;
		
		//5. String array
		String s[]= new String[3];
		s[0]="Hello";
		s[1]="world";
		s[2]="test";
		
		System.out.println(s.length);
		System.out.println(s[1]);

		//6.Object array:(Object is class)--is used to store different datatypes values 
		
		Object obj[]=new Object[6];
		obj[0]="Tom";
		obj[1]=25;
		obj[2]=12.25;
		obj[3]="1/1/1990";
		obj[4]='M';
		obj[5]="London";
		
		System.out.println(obj[5]);
		System.out.println(obj.length);
		
		for(int k=0;k<obj.length;k++) {
			System.out.println(obj[k]);
		}
		
	}
	

}
