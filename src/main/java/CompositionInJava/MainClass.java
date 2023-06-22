package CompositionInJava;

public class MainClass {

	public static void main(String[] args) {
		
		Human hm=new Human("Ganesh");
		Cat ct=new Cat("Tommy",hm);
		System.out.println(ct);	

	}

}
