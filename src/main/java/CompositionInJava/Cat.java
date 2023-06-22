package CompositionInJava;

public class Cat {

 private String name;
 
//cat belongs to human
 private Human owner;
 
	public Cat(String name,Human owner) {
		this.name = name;
		this.owner=owner;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", owner=" + owner + "]";
	}
	
	
}
