package OOPConceptPart1;

public class CallByValandCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValandCallByRef obj = new CallByValandCallByRef();
		int x= 10;
		int y=20;
		
		obj.testSum(x, y); //call by value or pass by value 
		
		obj.p=10;
		obj.q=60;
		
		obj.swap(obj);
		
		//after swap
		System.out.println("p is:" +obj.p);
		System.out.println("q is:"+obj.q);
		
	}
	
	public int testSum(int a,int b) {
		a= 30;
		b= 40;	
		
		int c = a + b;
		System.out.println("Sum is:" + c);
		return c;
	}

	
	//Call by reference 
	public void swap(CallByValandCallByRef t) {
		
		int temp;
		
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
	
	
}
