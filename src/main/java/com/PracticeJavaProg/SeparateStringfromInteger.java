package com.PracticeJavaProg;

public class SeparateStringfromInteger {

	public static void main(String[] args) {
	
		String str="123dheeraj123";
		
		StringBuffer alpha = new StringBuffer(), 
		        num = new StringBuffer();
		
		for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
        }
		
		System.out.println(alpha);
        System.out.println(num);
        
        
        int sum=0;
        
        int len=num.length();
    	
    	for(int i=0;i<len;i++) {
    		sum=sum+Character.getNumericValue(num.charAt(i));
    	}
        
    	System.out.println(sum);
    	
        }
	
	
			
	}

