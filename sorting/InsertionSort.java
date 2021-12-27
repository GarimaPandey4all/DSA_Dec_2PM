package com.brainmentors.dsa.sorting;

public class InsertionSort {
	
	static void insertionSort(int arr[], int n)
	{
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			
			//shifting loop
			while(j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = temp;
		}
		
		//for each or enhanced loop
		for(int list : arr)
		{
			System.out.print(list + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 4, 3, 2, 1};
		
		insertionSort(arr, arr.length);

	}

}
