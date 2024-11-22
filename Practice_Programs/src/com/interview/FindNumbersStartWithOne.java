package com.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindNumbersStartWithOne {

	//find all element starts with 1 from array/list
	public static void main(String[] args) {
		int []arr= {1,2,3,45,51,13,16,17,90};
		int[] array = Arrays.stream(arr).mapToObj(String::valueOf).filter(x->x.startsWith("1")).mapToInt(Integer::parseInt).toArray();
		for(int x:array)
		{
			System.out.println(x);
		}
	}
}
