package com.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		int[]arr= {1,4,6,7,4,8};
		
		//using stream API
		int[] reversedArr = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i]) // Reverse the index
                .toArray();
		for(int x:reversedArr)
		{
			System.out.print(x);
		}
		
		//using normal
		int[] x=new int[arr.length];
		int index=arr.length-1;
		for(int i=0;i<x.length;i++)
		{
			x[i]=arr[index];
			index--;
		}
		for(int x1:x)
		{
			System.out.print(x1);
		}
	}
	
}
