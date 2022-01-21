package com.brainmentors.dsa.arrays;

public class PairSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 6, 9, 10};
		int sum = 9;
		
		//two pointer approach
		int i = 0, j = arr.length - 1;
		
		while(i < j)
		{
			if(arr[i] + arr[j] == sum)
			{
				System.out.println("Pair Sum is: "+arr[i]+" "+arr[j]);
				System.exit(0);
			}
			else if(arr[i] + arr[j] < sum)
			{
				i++;
			}
			else if(arr[i] + arr[j] > sum)
			{
				j--;
			}
		}
	}
}
