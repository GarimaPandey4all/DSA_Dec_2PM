package com.brainmentors.dsa.arrays;

import java.util.Scanner;

public class LeadersElement2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter Values: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i = arr.length - 1; i >= 0; i--)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				System.out.println("Leader Element is: "+max);
			}
		}
		
	}

}
