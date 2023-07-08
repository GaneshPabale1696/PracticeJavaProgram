package PracticePrograms;

public class CallByReference {

	int x = 10;

	void sum(CallByReference a) {
		x = a.x + 5;
		System.out.println(x);
	}

	public static void main(String[] args) {

		CallByReference cbr = new CallByReference();
		cbr.sum(cbr);
		System.out.println(cbr.x);
	}

}
