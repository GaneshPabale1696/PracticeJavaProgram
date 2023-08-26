package PracticePrograms;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str="abcforabc";
		int index=-1;
		char fnc=' ';
		
		if(str.length()==0)
		{
			System.out.println("EMPTY STRING");
		}
		
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i)) {
				fnc=i;
				break;
			}
			else {
				index=index+1;
			}
			
		}
		
		if(index==str.length()-1) {
			System.out.println("All characters are repeating");
		}else
		{
			System.out.println("First non-repeating character is: " + fnc);
		}

	}

}
