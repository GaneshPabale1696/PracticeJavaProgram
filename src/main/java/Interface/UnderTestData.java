package Interface;

public class UnderTestData extends MechanicalClass{
	
	static int c=2;
	
	public final float j=12.45f;//value does not change
	
	public void Strim()
	{
		System.out.println("Strim the data");
	}
	
	public void Race()
	{
		System.out.println("Race the car");
	}

	final static int math(int a,int b) {
		
		System.out.println("Test");
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		UnderTestData utd=new UnderTestData();
	
		//Abstract class Methods 
		utd.Go();
		AbstractClass.forcre();
		utd.Interest();
		utd.passport();
		utd.TestDemo();
		AbstractClass.main(null);
		
		//InterFaceClass methods 
		utd.car();
		utd.DefaultMethodofInterface();
		utd.engine();
		utd.start();
		System.out.println(InterFaceClass.a);
		System.out.println(InterFaceClass.str);
		InterFaceClass.test();
		InterFaceClass.JustInTime();
		InterFaceClass.thunderStrome();
		
		//MechanicalClass methods
		utd.testmech();
		utd.TestDrive();
		
		//Bank Interface class methods
		utd.debit();
		utd.credit();
		utd.rate_of_interest();
	
		//UnderTestData
		utd.Strim();
		utd.Race();
		utd.test(13, 50);
		
		System.out.println("******Reference of Bank Class********");
		Bank bk=new UnderTestData();
		bk.credit();
		bk.debit();
		bk.rate_of_interest();

		System.out.println("******Reference of Abstract Class********");
		AbstractClass absc=new UnderTestData();
		absc.car();
		absc.credit();
		absc.debit();
		absc.engine();
		absc.Go();
		absc.Interest();
		absc.rate_of_interest();
		absc.DefaultMethodofInterface();
		absc.TestDemo();
		
		System.out.println("******Reference of Interface Class********");
		InterFaceClass interf=new UnderTestData();
		interf.car();
		interf.credit();
		interf.debit();
		interf.engine();
		interf.rate_of_interest();
		interf.start();
		interf.DefaultMethodofInterface();
	
		MechanicalClass mech=new UnderTestData();
		mech.car();
		mech.credit();
		mech.debit();
		mech.engine();
		mech.Go();
		mech.DefaultMethodofInterface();//Default method of interface
	
		UnderTestData.math(10, 17);
	
		UnderTestData.c=18;
		
		System.out.println(UnderTestData.c);
		
		
		System.out.println(utd.j);
		
	}

}
