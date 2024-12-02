package com.interview;

import java.util.Arrays;

public class RearrangeArray {

//	Given an integer unorder array of length n.
//	 Rearrange the array item in such a way that arr[i] = i and
//	 if i is not present then put -1 on that place. Where i is from 0 to n-1.
	 
//	Example:
//	Input: arr[] = {3, -1, 0, 5, 2, 14, 7, -1, 5, 4, 10 }
//	Output: arr[] = {0, -1, 2, 3, 4, 5 , -1, 7, -1, -1, 10 }
	
	public static void main(String[] args) {
		int []input= {3, -1, 0, 5, 2, 14, 7, -1, 5, 4, 10};
		int [] output=new int[input.length];
		
		//fill -1 in all index of output array
		Arrays.fill(output, -1);
		
		//iterate each element and then add in new array as per thier value in output array
		int length=input.length;
		for(int x:input)
		{
			if(x>=0 && x<=length)
			{
				output[x]=x;
			}
		}
		
		System.out.println(Arrays.toString(output));
		
	}
	
	
}
