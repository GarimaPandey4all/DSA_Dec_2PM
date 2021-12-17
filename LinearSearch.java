package com.brainmentors.dsa.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//int arr[] = new int[7];
		int arr[] = {12, 15, 28, 30, 56, 78, 90};
		
		System.out.println("Enter the Search value");
		int search = scanner.nextInt();
		
		int i = 0;
		
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] == search)
			{
				System.out.println("Search value is found");
				break;
			}
		}
		
		if(i == 7)
		{
			System.out.println("Search value is not found");
		}
	
	}

}
