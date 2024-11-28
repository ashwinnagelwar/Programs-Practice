package com.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergTwoArraysAndSort {

	public static void main(String[] args) {
		
//		Using normal way
		int []a= {1,5,2,6};
		int[]b= {3,9,7,4};
		
		int []mergedArray=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			mergedArray[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			mergedArray[a.length+i]=b[i];
		}
		
		Arrays.sort(mergedArray);
		for(int z:mergedArray)
		{
			System.out.print(z);
		}
		
//		Using Stream APi
		
		int[] sortedArrays = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		for(int v:sortedArrays)
		{
			System.out.print(v);
		}
	}
}
