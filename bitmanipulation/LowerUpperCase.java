package com.brainmentors.dsa.bitmanipulation;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		
		char arr[] = str.toCharArray();
		
		//lowercase
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (char) (arr[i] | ' '); // ' ' - 32
		}
		
		System.out.println(arr);
		
		//uppercase
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (char) (arr[i] & '_'); // '_' - 95 
		}
		
		System.out.println(arr);
		
		str = "HeLLo";
		
		arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (char) (arr[i] ^ ' '); // 
		}
		
		System.out.println(arr);
	}
}
