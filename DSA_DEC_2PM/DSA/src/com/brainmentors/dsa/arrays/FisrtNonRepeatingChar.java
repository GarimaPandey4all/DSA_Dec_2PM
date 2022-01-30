package com.brainmentors.dsa.arrays;

public class FisrtNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "garima";
		
		System.out.println("The given string is: "+str);
		
		for(int i = 0; i < str.length(); i++)
		{
			boolean unique = true;
			
			for(int j = 0; j < str.length(); j++)
			{
				if(i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			
			if(unique)
			{
				System.out.println("The first non-repeating character in string is: "+str.charAt(i));
				break;
			}
		}
	
	}

}
