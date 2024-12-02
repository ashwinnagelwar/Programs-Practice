package com.interview;

import java.util.HashSet;

public class FindLongestSubsequnceofNumbers {

//	Given an array of integers (unorder array)
//	 find the length of the longest subsequence such that elements
//	 in the subsequence are consecutive integers. The consecutive numbers can be in any order.
	 
//	Input: arr[] = {12, 121, 30, 36, 41, 56, 13, 55, 35, 44, 33, 34, 92, 43, 32, 42}
//	Output: 5
//	Explanation:
//	The subsequence 32,33,34,35,36 is the longest. (Length 5)
//	There are other sequences as well like [41,42,43,44] , [12, 13], [55, 56] etc.  
//	But above one is longest
	
	public static void main(String[] args) {
		int arr[] = {12, 121, 30, 36, 41, 56, 13, 55, 35, 44, 33, 34, 92, 43, 32, 42};
		
		HashSet<Integer> set=new HashSet<>();
		for(int x:arr)
		{
			set.add(x);
		}
		
		int maxlength=0;
		for(int a:arr)
		{
			if(!set.contains(a-1))
			{
				int start=a;
				int count=1;
				while(set.contains(start+1))
				{
					start++;
					count++;
				}
				maxlength=Math.max(0, count);
			}
		}
		
		
		
		System.out.println("Highest occurence of number sequence "+maxlength);
	}
}
