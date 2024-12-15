package com.interview;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		//sort given array
		int[] arr= {7,5,3,1,2,4,6,8};
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
