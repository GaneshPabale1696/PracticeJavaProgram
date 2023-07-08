package PracticePrograms;

public class Student {

	int SID;
	String Sname;
	int Sub1,Sub2,Sub3;
	
	void getStudData(int sid,String sname) {
		SID=sid;
		Sname=sname;
	}
	
	void getStudMarks(int mark1,int mark2,int mark3) {
		Sub1=mark1;
		Sub2=mark2;
		Sub3=mark3;
	}
	
	void totalMarks() {
		System.out.println(SID+" "+Sname);
		int total=Sub1+Sub2+Sub3;
		System.out.println("Total Marks is: "+ total);
	}
	
	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.getStudData(2,"Yogesh");
		stud.getStudMarks(90, 70, 80);
		stud.totalMarks();

	}

}
