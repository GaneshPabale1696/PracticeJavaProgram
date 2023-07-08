package PracticePrograms;

public class StaticClass {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("This is a static method: " + a);
	}

	void m2() {
		System.out.println("This is non static method:" + b);
	}

	void m3() {
		System.out.println("****This is non static method*****");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		StaticClass sc = new StaticClass();
		int c=sc.b=40;
		System.out.println(c);
	}
	
	static void m4() {
		System.out.println("****This is non static method*****");
		System.out.println(a);
		m1();
		StaticClass sc = new StaticClass();
		int c=sc.b=40;
		sc.m2();
		System.out.println(sc.b);
		System.out.println(c);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		System.out.println(a);

		StaticClass sc = new StaticClass();
		System.out.println(sc.b);
		sc.m2();
		sc.m3();
	
		m4();
		
	}

}
