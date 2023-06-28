package Abstraction;

public abstract class Animal {

	Animal() {
		System.out.println("Animal eat food");
	}

	public static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static final void pattern1(int n) {

		System.out.println("**************************");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {

		System.out.println("**************************");

		for (int i = 1; i <= n; i++) {
			
			for(int k=i;k<=n-1;k++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	
	public static void pattern3(int n) {

		System.out.println("**************************");

		for (int i = 1; i <= n; i++) {
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	public final void eat() {
		System.out.println("Animal---eat");
	}

}
