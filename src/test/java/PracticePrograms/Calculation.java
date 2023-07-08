package PracticePrograms;

public class Calculation {

	int a,b,c;
	
	Calculation(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	int Sum()
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Calculation cal=new Calculation(10,20,30);
		int total=cal.Sum();
		
		System.out.println(total);
	}

}
