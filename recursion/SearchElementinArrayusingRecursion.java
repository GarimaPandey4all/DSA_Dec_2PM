package com.brainmentors.dsa.recursion;

public class SearchElementinArrayusingRecursion {
	
	static int arr[] = {12, 34, 54, 70, 100};
	
	public static int search(int arr[], int l, int h, int s)
	{
		if(h < l)
		{
			return -1;
		}
		
		if(arr[l] == s)
		{
			return l;
		}
		
		if(arr[h] == s)
		{
			return h;
		}
		
		return search(arr, l+1, h-1, s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 54;
		
		int index = search(arr, 0, arr.length - 1, x);
		
		if(index != -1)
		{
			System.out.println("Search Element: "+x+" is present at index "+index);
		}
		else {
			System.out.println("Search Element "+x+" is not present");
		}

	}

}
