package com.interview;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		//find missing number in array
		int[]a= { 1, 3, 7, 5, 6, 2 };
		Arrays.sort(a);
		int num=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]!=i+1)
		{
			num=i+1;
			break;
		}
		
	}
		System.out.println("The missing number is "+num);
	}
}
