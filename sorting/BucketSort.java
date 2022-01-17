package com.brainmentors.dsa.sorting;

public class BucketSort {
	
	public static void bucketSort(int arr[], int n)
	{
		int hash[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			hash[arr[i]]++;
		}
		
		for(int i = 0, j = 0; i < n; i++)
		{
			while(hash[i] > 0)
			{
				arr[j++] = i;
				hash[i]--;
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 2, 1, 4, 3, 1};
		
		bucketSort(arr, arr.length);
		
	}

}
