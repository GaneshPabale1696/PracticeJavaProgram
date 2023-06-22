package Interface;

interface InterFaceClass extends Bank {

	int a = 10;// final variable--its value does not change

	static String str = "This is a test";

	public void car();

	public void start();

	public void engine();

	public default void DefaultMethodofInterface() {
		System.out.println("Test Data...");
	}
	
	public default int Test123() {
		System.out.println("Test Data...");
		return 0;
	}
	
	public default String StringManipulation() {
		System.out.println("Test Data...");
		return null;
	}

	public static void test() {
		System.out.println("Hana");
	}

	public static int JustInTime() {
		System.out.println("No more time is here");
		return 0;
	}

	public static String thunderStrome() {
		System.out.println("my whole life is change");
		return null;
	}

}
