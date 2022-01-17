package com.brainmentors.dsa.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = {3, 6, 8, 9, 13, 15, 19, 25};
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last)/2;
		
		System.out.println("Enter search value:");
		int search = scanner.nextInt();
		
		while(first <= last)
		{
			if(arr[middle] < search)
			{
				first = middle + 1;
			}
			else if(arr[middle] == search)
			{
				System.out.println("Search value is found");
				return;
			}
			else if(arr[middle] > search)
			{
				last = middle - 1;
			}
			
			middle = (first + last)/2;
		}
		
		if(first > last)
		{
			System.out.println("Search value is not found");
		}
	}
}
