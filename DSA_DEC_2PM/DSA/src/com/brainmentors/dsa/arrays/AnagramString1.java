package com.brainmentors.dsa.arrays;

import java.util.Arrays;

public class AnagramString1 {
	
	public static void anagramString(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram String");
			return;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		//sort
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		
		//hasing
		
		int hash1[] = new int[256];
		int hash2[] = new int[256];
		
		for(int i = 0; i < arr1.length; i++)
		{
			++hash1[arr1[i]];
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			++hash2[arr2[i]];
		}
		
		for(int i = 0; i < hash1.length; i++)
		{
			if(hash1[i] != hash2[i])
			{
				System.out.println("Not Anagram String");
				System.exit(0);
			}
		}
				
//		for(int i = 0; i < arr1.length; i++)
//		{
//			if(arr1[i] != arr2[i])
//			{
//				System.out.println("Not Anagram String");
//				System.exit(0);
//			}
//		}
		
		System.out.println("Anagram String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		listen, silent
		
		anagramString("listen", "sileot");

	}

}
