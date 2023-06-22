package OOPConceptpart2;

//child/base class
public class BMW extends Car{ //has-a relationship

//When same method is present in parent class as well as in child class with the 
//same name and same no. of arguments,is called method overriding 
public void start() { //overriden method
	System.out.println("BMW--strat");
}	
	
public void theftSafety() {
	System.out.println("BMW--theftSafety");
}
	
}
