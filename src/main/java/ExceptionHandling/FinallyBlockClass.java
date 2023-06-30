package ExceptionHandling;

public class FinallyBlockClass {

	public static void main(String[] args) {
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		} finally
		{
			System.out.println("Test the exception");
		}
		System.out.println("Hello world");

	}

}
