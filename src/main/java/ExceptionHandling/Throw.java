package ExceptionHandling;

public class Throw {
	
	public static void main(String[] args) 	  {
		
		System.out.println("ABC");
		
		try {
		throw new Exception("Ganesh Exception");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String Exe_Flag = " ";
		
		if(Exe_Flag.equals(" ")) {
			try {
			throw new Exception("Exec flag is Blank Exception");
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		}
		System.out.println("PQR");
	}

}
